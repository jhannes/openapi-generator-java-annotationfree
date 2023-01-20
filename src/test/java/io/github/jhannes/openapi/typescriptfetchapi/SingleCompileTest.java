package io.github.jhannes.openapi.typescriptfetchapi;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.nio.file.Path;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class SingleCompileTest {

    @TestFactory
    DynamicNode javaAnnotationFreeSnapshots() {
        Path spec = AbstractSnapshotTest.SNAPSHOT_ROOT.resolve("input/websockets.yaml");
        Path outputDir = spec.getParent().getParent().resolve("snapshot");
        return dynamicTest("javac " + spec, () -> CompilerTest.compile(outputDir.resolve(CompilerTest.getModelName(spec))));
    }

}
