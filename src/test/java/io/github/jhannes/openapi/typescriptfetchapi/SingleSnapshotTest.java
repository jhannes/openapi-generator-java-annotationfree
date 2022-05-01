package io.github.jhannes.openapi.typescriptfetchapi;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.nio.file.Path;

public class SingleSnapshotTest {

    @TestFactory
    DynamicNode javaAnnotationFreeSnapshots() {
        Path path = SnapshotTests.SNAPSHOT_ROOT;
        return SnapshotTests.createTestsForSpec(path.resolve("input/petstore.yaml"), path.resolve("output"), path.resolve("snapshot"));
    }

}
