package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

public class SnapshotTests extends AbstractSnapshotTest {

    @TestFactory
    Stream<DynamicNode> outputsShouldMatchSnapshots() throws IOException {
        List<DynamicNode> testSuites = new ArrayList<>();
        testSuites.add(snapshots(SNAPSHOT_ROOT));
        if (Files.isDirectory(LOCAL_SNAPSHOT_ROOT.resolve("input"))) {
            testSuites.add(snapshots(LOCAL_SNAPSHOT_ROOT));
        }
        return testSuites.stream();
    }

    protected DynamicNode snapshots(Path testDir) throws IOException {
        return dynamicContainer(
                "Snapshots of " + testDir,
                Files.list(testDir.resolve("input")).filter(p -> p.toFile().isFile()).map(this::createTests)
        );
    }

    protected DynamicNode createTests(Path spec) {
        return createTestNode(spec, createConfigurator(getModelName(spec)), getOutputDir(spec), getSnapshotDir(spec), false);
    }

}
