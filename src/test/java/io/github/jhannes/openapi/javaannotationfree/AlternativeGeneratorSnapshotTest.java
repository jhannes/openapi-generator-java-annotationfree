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
        Path outputDir = getTargetDir("output");
        return SnapshotTests.createTests(SPEC, outputDir, getTargetDir("snapshot"), createConfigurator(outputDir));
    }

    private static CodegenConfigurator createConfigurator(Path outputDir) {
        var modelName = SnapshotTests.getModelName(SPEC);
        return AbstractSnapshotTest.createBaseConfigurator(SPEC, outputDir)
                .setModelNameSuffix("Dto")
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .setModelPackage("io.github.jhannes.openapi." + modelName + ".model")
                .setApiPackage("io.github.jhannes.openapi." + modelName + ".api")
                .setGeneratorName(GENERATOR_NAME);
    }

    private Path getTargetDir(String subdir) {
        return ROOT_DIR.resolve(subdir).resolve(SnapshotTests.getModelName(SPEC));
    }

}
