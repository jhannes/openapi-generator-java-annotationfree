package io.github.jhannes.openapi.typescriptfetchapi;

import difflib.DiffUtils;
import difflib.Patch;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class SnapshotTests {

    @TestFactory
    Stream<DynamicNode> javaAnnotationFreeSnapshots() throws IOException {
        return Stream.of(
                snapshots(Paths.get("snapshotTests"), "java-annotationfree", Paths.get("snapshotTests").resolve("output"), Paths.get("snapshotTests").resolve("snapshot")),
                snapshots(Paths.get("localSnapshotTests"), "java-annotationfree", Paths.get("localSnapshotTests").resolve("output"), Paths.get("localSnapshotTests").resolve("snapshot"))
        );
    }

    private DynamicNode snapshots(Path testDir, String generatorName, Path outputDir, Path snapshotDir) throws IOException {
        Path inputDir = testDir.resolve("input");
        if (!Files.isDirectory(inputDir)) {
            return dynamicTest("No snapshots for " + testDir, () -> {});
        }
        cleanDirectory(outputDir);
        return dynamicContainer(
                "Snapshots of " + testDir,
                Files.list(inputDir)
                        .filter(p -> p.toFile().isFile())
                        .map(spec -> createTestsForSpec(spec, generatorName, outputDir, snapshotDir))
        );
    }

    private DynamicNode createTestsForSpec(Path spec, String generatorName, Path outputDir, Path snapshotDir) {
        generate(spec, generatorName, outputDir, getModelName(spec));

        List<Path> files;
        try (Stream<Path> list = Files.walk(outputDir.resolve(getModelName(spec)))) {
            files = list.filter(this::isTextOutput).collect(Collectors.toList());
        } catch (IOException e) {
            return dynamicTest("Snapshots for " + spec, () -> assertNull(e));
        }
        return dynamicContainer("Snapshots for " + spec, Stream.of(
                dynamicTest("Files", () -> compareFiles(outputDir, snapshotDir, getModelName(spec))),
                dynamicContainer("File contents in " + outputDir, files.stream().map(file ->
                        dynamicTest("file " + outputDir.relativize(file), () -> diff(file, snapshotDir.resolve(outputDir.relativize(file))))
                ))));
    }

    private void compareFiles(Path output, Path snapshotDir, String modelName) throws IOException {
        String outputFiles = Files.walk(output.resolve(modelName)).map(path -> output.relativize(path).toString()).collect(Collectors.joining("\n"));
        String snapshotFiles = Files.walk(snapshotDir.resolve(modelName)).map(path -> snapshotDir.relativize(path).toString()).collect(Collectors.joining("\n"));
        assertEquals(snapshotFiles, outputFiles);
    }

    private boolean isTextOutput(Path path) {
        return Files.isRegularFile(path) && !path.toString().endsWith(".jar");
    }

    private void diff(Path file, Path snapshot) throws IOException {
        assertTrue(Files.exists(snapshot), "Missing " + snapshot);
        Patch<String> diff = DiffUtils.diff(Files.readAllLines(file), Files.readAllLines(snapshot));
        assertEquals("", diff.getDeltas().stream().map(Object::toString).collect(Collectors.joining("\n")));
    }

    private void generate(Path file, String generatorName, Path output, String modelName) {
        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName(generatorName)
                .setInputSpec(file.toString())
                .setModelNameSuffix("Dto")
                .setPackageName("io.github.jhannes.openapi." + modelName)
                .setModelPackage("io.github.jhannes.openapi." + modelName + ".model")
                .setApiPackage("io.github.jhannes.openapi." + modelName + ".api")
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .addAdditionalProperty("generateSupportingFiles", "true")
                .addAdditionalProperty("generateModelTests", "true")
                .addAdditionalProperty("generateApis", "false")
                .addAdditionalProperty("dateLibrary", "java8")
                //.addAdditionalProperty(CodegenConstants.ARTIFACT_ID, modelName)
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
