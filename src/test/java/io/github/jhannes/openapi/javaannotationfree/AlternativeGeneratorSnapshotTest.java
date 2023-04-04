package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.nio.file.Path;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * Use this test to check the behavior of other generators
 */
public class AlternativeGeneratorSnapshotTest extends AbstractSnapshotTest {

    public static final Path SPEC = SNAPSHOT_ROOT.resolve("input/typeHierarchy.yaml");
    public static final String GENERATOR_NAME = "java";

    @TestFactory
    DynamicNode outputShouldMatchSnapshot() {
        Path outputDir = getTargetDir("output");
        return SnapshotTests.createTests(SPEC, outputDir, getTargetDir("snapshot"), createConfigurator(outputDir));
    }

    private static CodegenConfigurator createConfigurator(Path outputDir) {
        return createBaseConfigurator(SnapshotTests.getModelName(SPEC), SPEC, outputDir).setGeneratorName(GENERATOR_NAME);
    }

    private static Path getTargetDir(String subdir) {
        return getRootDir(SPEC).resolve("generators").resolve(GENERATOR_NAME).resolve(subdir).resolve(SnapshotTests.getModelName(SPEC));
    }

}
