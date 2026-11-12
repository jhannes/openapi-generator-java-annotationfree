package io.github.jhannes.openapi.javaannotationfree;

import io.github.jhannes.openapi.javaannotationfree.testsupport.GeneratorTestFactory;
import org.junit.jupiter.api.DynamicNode;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.nio.file.Path;
import java.nio.file.Paths;

import static io.github.jhannes.openapi.javaannotationfree.testsupport.GeneratorTestFactory.getBasePath;

public class AbstractSnapshotTest {
    public static final Path SNAPSHOT_ROOT = Paths.get("snapshotTests");
    public static final Path LOCAL_SNAPSHOT_ROOT = Paths.get("localSnapshotTests");

    protected static CodegenConfigurator createConfigurator(String modelName) {
        return new CodegenConfigurator()
                .setModelNameSuffix("Dto")
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .setGeneratorName("java-annotationfree")
                .setPackageName("io.github.jhannes.openapi." + modelName);
    }

    static Path getSnapshotDir(Path spec) {
        return getBasePath(spec).map(p -> p.resolve("snapshot"))
                .orElse(spec.getParent().getParent().resolve("snapshot").resolve(SnapshotTests.getModelName(spec)));
    }

    static Path getCompileDir(Path spec) {
        return getBasePath(spec).map(p -> p.resolve("compile"))
                .orElse(spec.getParent().getParent().resolve("compile").resolve(SnapshotTests.getModelName(spec)));
    }

    static Path getOutputDir(Path spec) {
        return getBasePath(spec).map(p -> p.resolve("output"))
                .orElse(spec.getParent().getParent().resolve("output").resolve(getModelName(spec)));
    }

    protected static String getModelName(Path file) {
        String filename = file.getFileName().toString();
        int lastDot = filename.lastIndexOf('.');
        return lastDot < 0 ? filename : filename.substring(0, lastDot);
    }

    protected static DynamicNode createTestNode(Path spec, CodegenConfigurator configurator, Path outputDir, Path snapshotDir, boolean ignoreWhitespace) {
        return new GeneratorTestFactory(configurator, spec, outputDir).createSnapshotTests(snapshotDir, ignoreWhitespace);
    }
}
