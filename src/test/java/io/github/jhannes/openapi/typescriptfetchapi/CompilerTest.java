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
    Stream<DynamicNode> javaAnnotationFreeSnapshots() throws IOException {
        return Stream.of(
                snapshots(Paths.get("snapshotTests"), "java-annotationfree", Paths.get("snapshotTests").resolve("compile"), Paths.get("snapshotTests").resolve("snapshot")),
                snapshots(Paths.get("localSnapshotTests"), "java-annotationfree", Paths.get("snapshotTests").resolve("compile"), Paths.get("snapshotTests").resolve("snapshot"))
        );
    }

    private DynamicNode snapshots(Path testDir, String generatorName, Path outputDir, Path snapshotDir) throws IOException {
        Path inputDir = testDir.resolve("input");
        if (!Files.isDirectory(inputDir)) {
            return dynamicTest("No snapshots for " + testDir, () -> {});
        }
        cleanDirectory(outputDir);
        return dynamicContainer(
                "Verifications of " + testDir,
                Files.list(inputDir)
                        .filter(p -> p.toFile().isFile())
                        .map(spec -> dynamicContainer("Verify " + spec, Arrays.asList(
                                dynamicTest("Generate " + spec, () -> generate(spec, generatorName, outputDir, getModelName(spec))),
                                dynamicTest("java " + spec, () -> compile(outputDir.resolve(getModelName(spec))))
                        )))
        );
    }

    private void generate(Path file, String generatorName, Path output, String modelName) {
        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(generatorName)
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
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        try (StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {

            List<Path> files = Files.find(
                    path.resolve("src/main/java"),
                    999,
                    (p, fa) -> !p.toString().contains(File.separator + "api" + File.separator) // Ignore files with action-controller dependency
                            && p.getFileName().toString().endsWith(".java")
                            && fa.isRegularFile()
            ).collect(Collectors.toList());

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
            try (Stream<Path> walk = Files.walk(directory)) {
                walk.sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
            }
        }
    }

}
