package io.github.jhannes.openapi.typescriptfetchapi;

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
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class CompilerTest {

    @TestFactory
    Stream<DynamicNode> exampleSpecifications() throws IOException {
        List<DynamicNode> testSuites = new ArrayList<>();
        testSuites.add(compileSpec(SnapshotTests.SNAPSHOT_ROOT, SnapshotTests.SNAPSHOT_ROOT.resolve("compile")));
        if (Files.isDirectory(SnapshotTests.LOCAL_SNAPSHOT_ROOT)) {
            testSuites.add(compileSpec(SnapshotTests.LOCAL_SNAPSHOT_ROOT, SnapshotTests.LOCAL_SNAPSHOT_ROOT.resolve("compile")));
        }
        return testSuites.stream();
    }

    private DynamicNode compileSpec(Path testDir, Path outputDir) throws IOException {
        Path inputDir = testDir.resolve("input");
        cleanDirectory(outputDir);
        return dynamicContainer(
                "Compiling of " + testDir,
                Files.list(inputDir)
                        .filter(p -> p.toFile().isFile())
                        .map(spec -> dynamicContainer("Compile " + spec, Arrays.asList(
                                dynamicTest("Generate " + spec, () -> generate(spec, outputDir, getModelName(spec))),
                                dynamicTest("javac " + spec, () -> compile(outputDir.resolve(getModelName(spec))))
                        )))
        );
    }

    private void generate(Path file, Path output, String modelName) throws IOException {
        if (file.getFileName().toString().endsWith(".link")) {
            file = Paths.get(Files.readAllLines(file).get(0));
        }
        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("java-annotationfree")
                .setInputSpec(file.toString().replaceAll("\\\\", "/"))
                .setModelNameSuffix("Dto")
                .setPackageName("io.github.jhannes.openapi." + modelName)
                .setModelPackage("io.github.jhannes.openapi." + modelName + ".model")
                .setApiPackage("io.github.jhannes.openapi." + modelName + ".api")
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .addAdditionalProperty("generateSupportingFiles", "true")
                .addAdditionalProperty("generateModelTests", "true")
                .addAdditionalProperty("generateApis", "false")
                .addAdditionalProperty("dateLibrary", "java8")
                .setOutputDir(output.resolve(modelName).toString());

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        generator.opts(clientOptInput).generate();
    }


    private String getModelName(Path file) {
        String filename = file.getFileName().toString();
        int lastDot = filename.lastIndexOf('.');
        return lastDot < 0 ? filename : filename.substring(0, lastDot);
    }

    private void compile(Path path) throws IOException {
        String actionControllerPath = Stream.of(System.getProperty("java.class.path").split(System.getProperty("path.separator")))
                .filter(s -> s.contains("action-controller"))
                .findFirst().orElseThrow(() -> new RuntimeException("Can't find action-controller in classpath"));
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        try (StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {

            List<Path> files = Files.find(
                    path.resolve("src/main/java"),
                    999,
                    (p, fa) -> p.getFileName().toString().endsWith(".java") && fa.isRegularFile()
            ).collect(Collectors.toList());

            List<String> options = List.of("-cp", actionControllerPath, "-d", path.resolve("target/compile").toString());
            System.out.println("javac " + String.join(" " , options) + " " + files.stream().map(Path::toString).collect(Collectors.joining(" ")));

            DiagnosticCollector<JavaFileObject> diagnosticListener = new DiagnosticCollector<>();
            JavaCompiler.CompilationTask task = compiler.getTask(
                    null,
                    fileManager,
                    diagnosticListener,
                    List.of("-d", "target/testCompile/" + path.getFileName()),
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

    private void cleanDirectory(Path directory) throws IOException {
        if (Files.isDirectory(directory)) {
            System.out.println("rm -r " + directory);
            try (Stream<Path> walk = Files.walk(directory)) {
                walk.sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
            }
        }
    }

}
