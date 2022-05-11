package io.github.jhannes.openapi.typescriptfetchapi;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.nio.file.Path;

public class SingleCompileTest {

    @TestFactory
    DynamicNode javaAnnotationFreeSnapshots() {
        Path spec = SnapshotTests.LOCAL_SNAPSHOT_ROOT.resolve("input/frrmobil.link");
        return CompilerTest.createTestFromSpec(spec);
    }

}
