package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicNode;
import org.openapitools.codegen.config.CodegenConfigurator;

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
        var outputRoot = spec.getParent().getParent().resolve("generators").resolve("java17");
        return createTestNode(spec, createJava17Configurator(getModelName(spec)), outputRoot.resolve("output").resolve(getModelName(spec)), outputRoot.resolve("snapshot").resolve(getModelName(spec)));
    }

    static CodegenConfigurator createJava17Configurator(String modelName) {
        return AbstractSnapshotTest.createConfigurator(modelName).addAdditionalProperty("supportJava17", true);
    }

}
