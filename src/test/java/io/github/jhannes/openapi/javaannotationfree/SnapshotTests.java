package io.github.jhannes.openapi.javaannotationfree;

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
import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class SnapshotTests extends AbstractSnapshotTest {

    @TestFactory
    Stream<DynamicNode> outputsShouldMatchSnapshots() throws IOException {
        List<DynamicNode> testSuites = new ArrayList<>();
        testSuites.add(snapshots(SNAPSHOT_ROOT));
        if (Files.isDirectory(LOCAL_SNAPSHOT_ROOT)) {
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
                        .map(this::createTestsForSpec)
        );
    }

    public DynamicNode createTestsForSpec(Path spec) {
        Path rootDir = spec.getParent().getParent();
        String modelName = getModelName(spec);
        Path outputDir = rootDir.resolve("output").resolve(modelName);
        Path snapshotDir = rootDir.resolve("snapshot").resolve(modelName);
        return createTests(spec, outputDir, snapshotDir, createConfigurator(modelName, spec, outputDir));
    }

    static DynamicNode createTests(Path spec, Path outputDir, Path snapshotDir, CodegenConfigurator configurator) {
        try {
            cleanDirectory(outputDir);
            generate(configurator);
        } catch (Exception e) {
            return dynamicTest("Generator for " + spec, () -> {
                throw e;
            });
        }

        return SnapshotDiffDynamicTest.compareDirectories(spec, outputDir, snapshotDir);
    }

    static void generate(CodegenConfigurator configurator) {
        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        generator.opts(clientOptInput).generate();
    }

    public static String getModelName(Path file) {
        String filename = file.getFileName().toString();
        int lastDot = filename.lastIndexOf('.');
        return lastDot < 0 ? filename : filename.substring(0, lastDot);
    }
}
