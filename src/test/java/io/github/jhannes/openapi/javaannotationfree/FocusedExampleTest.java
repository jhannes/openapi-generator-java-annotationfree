package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.nio.file.Path;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

/**
 * Use this test to fix bugs and develop new features:
 *
 * <ol>
 *     <li>Decide what {@link #SPEC} to use</li>
 *     <li>Run the test class to verify the baseline</li>
 *     <li>Update files under <code>snapshotTests/snapshots/&lt;SPEC&gt;/</code> to match your desired output</li>
 *     <li>The test {@link #snapshotShouldCompile()} will fail if your changes resulted in syntax error</li>
 *     <li>
 *         The test {@link #outputShouldMatchSnapshot()} will fail until the output matches your desired snapshot.
 *         Update the templates under <code>src/main/resources</code> to make it pass
 *     </li>
 * </ol>
 */
public class FocusedExampleTest extends AbstractSnapshotTest {

    public static final Path SPEC = SNAPSHOT_ROOT.resolve("input/openid-configuration.yaml");
    public static final Path ROOT_DIR = SPEC.getParent().getParent();

    @TestFactory
    DynamicNode snapshotShouldCompile() {
        Path snapshotDir = ROOT_DIR.resolve("snapshot").resolve(getModelName());
        return dynamicTest("Compile " + snapshotDir, () -> CompilerTest.compile(snapshotDir));
    }


    @TestFactory
    DynamicNode outputShouldMatchSnapshot() {
        Path outputDir = ROOT_DIR.resolve("output").resolve(getModelName());
        Path snapshotDir = ROOT_DIR.resolve("snapshot").resolve(getModelName());
        return SnapshotTests.createTests(SPEC, outputDir, snapshotDir, createConfigurator(outputDir));
    }

    @TestFactory
    DynamicNode outputShouldCompile() {
        var targetRoot = ROOT_DIR.resolve("compile");
        var configurator = createConfigurator(targetRoot.resolve(getModelName()));
        return CompilerTest.createTestFromSpec(SPEC, configurator, targetRoot.resolve(getModelName(SPEC)));
    }

    private static CodegenConfigurator createConfigurator(Path targetDir) {
        return createConfigurator(getModelName(), SPEC, targetDir);
    }

    private static String getModelName() {
        return SnapshotTests.getModelName(SPEC);
    }
}
