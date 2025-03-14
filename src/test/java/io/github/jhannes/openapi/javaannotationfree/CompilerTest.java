package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
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
        if (Files.isDirectory(AbstractSnapshotTest.LOCAL_SNAPSHOT_ROOT.resolve("input"))) {
            testSuites.add(compileSpec(AbstractSnapshotTest.LOCAL_SNAPSHOT_ROOT));
        }
        return testSuites.stream();
    }

    DynamicNode compileSpec(Path testDir) throws IOException {
        Path inputDir = testDir.resolve("input");
        return dynamicContainer(
                "Output should compile: " + testDir,
                Files.list(inputDir).filter(p -> p.toFile().isFile()).map(CompilerTest::createTestFromSpec)
        );
    }

    public static DynamicNode createTestFromSpec(Path spec) {
        return createTestNode(spec, createConfigurator(getModelName(spec)), getCompileDir(spec));
    }

    private static DynamicContainer createTestNode(Path spec, CodegenConfigurator configurator, Path outputDir) {
        configurator.setInputSpec(getInputSpec(spec));
        configurator.setOutputDir(outputDir.toString());
        return dynamicContainer("Compile " + spec, Arrays.asList(
                dynamicTest("Clean " + outputDir, () -> cleanDirectory(outputDir)),
                dynamicTest("Generate " + outputDir, () -> generate(configurator)),
                dynamicTest("javac " + outputDir, () -> compile(outputDir))
        ));
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
