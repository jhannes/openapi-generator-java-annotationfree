package io.github.jhannes.openapi.typescriptfetchapi;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.nio.file.Path;

public class SingleCompileTest {

    @TestFactory
    DynamicNode javaAnnotationFreeSnapshots() {
        Path path = SnapshotTests.SNAPSHOT_ROOT;
        return CompilerTest.createTestFromSpec(path.resolve("input/petstore.yaml"), path.resolve("compile"));
    }

}
