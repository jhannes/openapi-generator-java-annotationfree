package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.nio.file.Path;

/**
 * Use this test to check the behavior of other generators
 */
public class AlternativeGeneratorSnapshotTest extends AbstractSnapshotTest {

    public static final Path SPEC = SNAPSHOT_ROOT.resolve("input/typeHierarchy.yaml");
    public static final String GENERATOR_NAME = "java";
    public static final Path ROOT_DIR = SPEC.getParent().getParent().resolve("generators").resolve(GENERATOR_NAME);

    @TestFactory
    DynamicNode outputShouldMatchSnapshot() {
        Path outputDir = ROOT_DIR.resolve("output").resolve(getModelName(SPEC));
        Path snapshotDir = ROOT_DIR.resolve("snapshot").resolve(getModelName(SPEC));
        return SnapshotTests.createTestNode(SPEC, createJavaConfigurator(getModelName(SPEC)), outputDir, snapshotDir);
    }

    static CodegenConfigurator createJavaConfigurator(String modelName) {
        return new CodegenConfigurator()
                .setModelNameSuffix("Dto")
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .setModelPackage("io.github.jhannes.openapi." + modelName + ".model")
                .setApiPackage("io.github.jhannes.openapi." + modelName + ".api")
                .setLibrary("native")
                .setGeneratorName(GENERATOR_NAME);
    }
}
