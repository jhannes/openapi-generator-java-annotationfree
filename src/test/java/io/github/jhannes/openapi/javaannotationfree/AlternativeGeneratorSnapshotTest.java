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
        String modelName = getModelName(SPEC);
        Path outputDir = ROOT_DIR.resolve("output").resolve(getModelName(SPEC));
        var configurator = createJavaConfigurator(modelName, SPEC, outputDir);
        return SnapshotTests.createTests(SPEC, outputDir, getTargetDir("snapshot"), configurator);
    }

    static CodegenConfigurator createJavaConfigurator(String modelName, Path input, Path outputDir) {
        return AbstractSnapshotTest.createBaseConfigurator(input, outputDir)
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .setModelPackage("io.github.jhannes.openapi." + modelName + ".model")
                .setApiPackage("io.github.jhannes.openapi." + modelName + ".api")
                .setLibrary("native")
                .setGeneratorName(GENERATOR_NAME);
    }

    private Path getTargetDir(String subdir) {
        return ROOT_DIR.resolve(subdir).resolve(SnapshotTests.getModelName(SPEC));
    }

}
