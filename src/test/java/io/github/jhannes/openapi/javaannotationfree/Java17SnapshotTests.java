package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class Java17SnapshotTests extends SnapshotTests {

    protected DynamicNode snapshots(Path testDir) throws IOException {
        Path snapshotDir = testDir.resolve("generators").resolve("java17").resolve("snapshot");
        if (!Files.isDirectory(snapshotDir)) {
            return dynamicTest("No snapshots for " + testDir, () -> {});
        }
        return dynamicContainer(
                "Snapshots of " + testDir,
                Files.list(testDir.resolve("input"))
                        .filter(p -> p.toFile().isFile())
                        .map(this::createTests)
        );
    }

    public DynamicNode createTests(Path spec) {
        return createTestNode(
                spec,
                AbstractSnapshotTest.createConfigurator(getModelName(spec)).addAdditionalProperty("supportJava17", true),
                spec.getParent().getParent().resolve("generators").resolve("java17").resolve("output").resolve(getModelName(spec)),
                spec.getParent().getParent().resolve("generators").resolve("java17").resolve("snapshot").resolve(getModelName(spec))
        );
    }

}
