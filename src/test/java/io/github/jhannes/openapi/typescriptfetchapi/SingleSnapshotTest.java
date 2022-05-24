package io.github.jhannes.openapi.typescriptfetchapi;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.nio.file.Path;

public class SingleSnapshotTest {

    @TestFactory
    DynamicNode javaAnnotationFreeSnapshots() {
        Path spec = AbstractSnapshotTest.SNAPSHOT_ROOT.resolve("input/bigExample.yaml");
        return SnapshotTests.createTestsForSpec(spec);
    }

}
