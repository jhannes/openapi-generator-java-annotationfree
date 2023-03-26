package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class CompilerTest extends AbstractSnapshotTest {

    @TestFactory
    Stream<DynamicNode> outputsFromSpecsShouldCompile() throws IOException {
        List<DynamicNode> testSuites = new ArrayList<>();
        testSuites.add(compileSpec(AbstractSnapshotTest.SNAPSHOT_ROOT));
        if (Files.isDirectory(AbstractSnapshotTest.LOCAL_SNAPSHOT_ROOT)) {
            testSuites.add(compileSpec(AbstractSnapshotTest.LOCAL_SNAPSHOT_ROOT));
        }
        return testSuites.stream();
    }

    static DynamicNode compileSpec(Path testDir) throws IOException {
        Path inputDir = testDir.resolve("input");
        return dynamicContainer(
                "Output should compile: " + testDir,
                Files.list(inputDir)
                        .filter(p -> p.toFile().isFile())
                        .map(CompilerTest::createTestFromSpec)
        );
    }

    public static DynamicNode createTestFromSpec(Path spec) {
        return createTestFromSpec(spec, targetDir(spec, "compile"));
    }

    static DynamicContainer createTestFromSpec(Path spec, Path outputDir) {
        return dynamicContainer("Compile " + spec, Arrays.asList(
                dynamicTest("Clean " + spec, () -> cleanDirectory(outputDir)),
                dynamicTest("Generate " + spec, () -> generate(spec, outputDir, getModelName(spec))),
                dynamicTest("javac " + spec, () -> compile(outputDir.resolve(getModelName(spec))))
        ));
    }

    static void generate(Path spec, Path outputRoot, String modelName) {
        Path outputDir = outputRoot.resolve(modelName);
        final CodegenConfigurator configurator = createConfigurator(modelName, spec, outputDir);

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        generator.opts(clientOptInput).generate();
    }


    static String getModelName(Path file) {
        String filename = file.getFileName().toString();
        int lastDot = filename.lastIndexOf('.');
        return lastDot < 0 ? filename : filename.substring(0, lastDot);
    }

    static void compile(Path path) throws IOException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        try (StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {

            List<Path> files = Files.find(
                    path.resolve("src/main/java"),
                    999,
                    (p, fa) -> p.getFileName().toString().endsWith(".java") && fa.isRegularFile()
            ).collect(Collectors.toList());

            List<String> options = List.of("-Xlint:deprecation", "-d", path.resolve("target/compile").toString());
            System.out.println("javac " + String.join(" " , options) + " " + files.stream().map(Path::toString).collect(Collectors.joining(" ")));

            DiagnosticCollector<JavaFileObject> diagnosticListener = new DiagnosticCollector<>();
            JavaCompiler.CompilationTask task = compiler.getTask(
                    null,
                    fileManager,
                    diagnosticListener,
                    List.of("-Xlint:deprecation", "-d", "target/testCompile/" + path.getFileName()),
                    null,
                    fileManager.getJavaFileObjectsFromPaths(files)
            );
            Boolean result = task.call();
            if (!diagnosticListener.getDiagnostics().isEmpty()) {
                fail(diagnosticListener.getDiagnostics().toString());
            }
            assertTrue(result);
        }
    }

}
