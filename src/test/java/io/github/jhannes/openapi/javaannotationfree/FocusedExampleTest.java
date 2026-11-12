package io.github.jhannes.openapi.javaannotationfree;

import io.github.jhannes.openapi.javaannotationfree.testsupport.GeneratorTestFactory;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

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

    public static final Path SPEC;

    static {
        String spec = System.getenv("SPEC");
        SPEC = spec != null ? Paths.get(spec) : SNAPSHOT_ROOT.resolve("input/websockets.yaml");
    }

    @TestFactory
    DynamicNode snapshotShouldCompile() {
        return GeneratorTestFactory.createCompileTest(getSnapshotDir(SPEC));
    }

    @TestFactory
    DynamicNode outputShouldMatchSnapshot() {
        return createTestNode(SPEC, createConfigurator(getModelName(SPEC)), getOutputDir(SPEC), getSnapshotDir(SPEC), false);
    }

    @TestFactory
    DynamicNode outputShouldCompile() {
        return CompilerTest.createTestFromSpec(SPEC);
    }
}
