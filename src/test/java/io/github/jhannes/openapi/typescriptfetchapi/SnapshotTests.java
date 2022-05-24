package io.github.jhannes.openapi.typescriptfetchapi;

import difflib.DeleteDelta;
import difflib.Delta;
import difflib.DiffUtils;
import difflib.InsertDelta;
import difflib.Patch;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class SnapshotTests extends AbstractSnapshotTest {

    @TestFactory
    Stream<DynamicNode> javaAnnotationFreeSnapshots() throws IOException {
        List<DynamicNode> testSuites = new ArrayList<>();
        testSuites.add(snapshots(SNAPSHOT_ROOT));
        if (Files.isDirectory(AbstractSnapshotTest.LOCAL_SNAPSHOT_ROOT)) {
            testSuites.add(snapshots(LOCAL_SNAPSHOT_ROOT));
        }
        return testSuites.stream();
    }

    private DynamicNode snapshots(Path testDir) throws IOException {
        Path inputDir = testDir.resolve("input");
        Path snapshotDir = testDir.resolve("snapshot");
        if (!Files.isDirectory(snapshotDir)) {
            return dynamicTest("No snapshots for " + testDir, () -> {});
        }
        return dynamicContainer(
                "Snapshots of " + testDir,
                Files.list(inputDir)
                        .filter(p -> p.toFile().isFile())
                        .map(SnapshotTests::createTestsForSpec)
        );
    }

    public static DynamicNode createTestsForSpec(Path spec) {
        return createTestsForSpec(spec, spec.getParent().getParent().resolve("output"), spec.getParent().getParent().resolve("snapshot"));
    }

    static DynamicNode createTestsForSpec(Path spec, Path outputRoot, Path snapshotRoot) {
        String modelName = getModelName(spec);
        CodegenConfigurator configurator = AbstractSnapshotTest.createConfigurator(modelName, spec, outputRoot.resolve(modelName));
        return createTests(spec, outputRoot.resolve(modelName), snapshotRoot.resolve(modelName), configurator);
    }

    static DynamicNode createTests(Path spec, Path outputDir, Path snapshotDir, CodegenConfigurator configurator) {
        try {
            AbstractSnapshotTest.cleanDirectory(outputDir);
            generate(configurator);
        } catch (Exception e) {
            return dynamicTest("Generator for " + spec, () -> {
                throw e;
            });
        }

        List<Path> files;
        try (Stream<Path> list = Files.walk(outputDir)) {
            files = list.filter(SnapshotTests::isTextOutput).collect(Collectors.toList());
        } catch (IOException e) {
            return dynamicTest("Snapshots for " + spec, () -> assertNull(e));
        }
        return dynamicContainer("Snapshots for " + spec, Stream.of(
                dynamicTest("Files", () -> compareFiles(outputDir, snapshotDir)),
                dynamicContainer("File contents in " + outputDir, files.stream().map(file ->
                        dynamicTest("file " + outputDir.relativize(file), () -> diff(snapshotDir.resolve(outputDir.relativize(file)), file))
                ))));
    }

    private static void compareFiles(Path outputDir, Path snapshotDir) throws IOException {
        String outputFiles = Files.walk(outputDir).map(path -> outputDir.getParent().relativize(path).toString()).collect(Collectors.joining("\n"));
        String snapshotFiles = Files.walk(snapshotDir).map(path -> snapshotDir.getParent().relativize(path).toString()).collect(Collectors.joining("\n"));
        assertEquals(snapshotFiles, outputFiles);
    }

    private static boolean isTextOutput(Path path) {
        return Files.isRegularFile(path) && !path.toString().endsWith(".jar");
    }

    private static void diff(Path file, Path snapshot) throws IOException {
        assertTrue(Files.exists(snapshot), "Missing " + snapshot);
        Patch<String> diff = DiffUtils.diff(Files.readAllLines(file), Files.readAllLines(snapshot));
        if (!diff.getDeltas().isEmpty()) {
            List<Delta<String>> significantDiff = diff.getDeltas().stream().filter(delta -> !whitespaceOnly(delta)).collect(Collectors.toList());
            if (significantDiff.isEmpty()) {
                fail("whitespace difference: " + diff.getDeltas());
            } else {
                fail("significant difference: " + significantDiff.stream().map(Object::toString).collect(Collectors.joining("\n")));
            }
        }
    }

    private static boolean whitespaceOnly(Delta<String> delta) {
        if (delta instanceof InsertDelta) {
            return delta.getRevised().getLines().stream().allMatch(s -> s == null || s.trim().length() == 0);
        } else if (delta instanceof DeleteDelta) {
            return delta.getOriginal().getLines().stream().allMatch(s -> s == null || s.trim().length() == 0);
        } else {
            return false;
        }
    }

    static void generate(CodegenConfigurator configurator) {
        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        generator.opts(clientOptInput).generate();
    }

    static String getModelName(Path file) {
        String filename = file.getFileName().toString();
        int lastDot = filename.lastIndexOf('.');
        return lastDot < 0 ? filename : filename.substring(0, lastDot);
    }
}
