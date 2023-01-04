package io.github.jhannes.openapi.typescriptfetchapi;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.nio.file.Path;

public class SingleCompileTest {

    @TestFactory
    DynamicNode javaAnnotationFreeSnapshots() {
        Path spec = AbstractSnapshotTest.SNAPSHOT_ROOT.resolve("input/websockets.yaml");
        return CompilerTest.createTestFromSpec(spec);
    }

}
