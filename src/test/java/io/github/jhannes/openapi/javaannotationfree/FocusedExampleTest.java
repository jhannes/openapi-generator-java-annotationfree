package io.github.jhannes.openapi.javaannotationfree;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

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
public class FocusedExampleTest {

    public static final Path SPEC = AbstractSnapshotTest.SNAPSHOT_ROOT.resolve("input/petstore.yaml");

    @TestFactory
    DynamicNode snapshotShouldCompile() {
        Path outputDir = AbstractSnapshotTest.targetDir(SPEC, "snapshot");
        return dynamicTest("Compile " + outputDir, () -> CompilerTest.compile(outputDir.resolve(CompilerTest.getModelName(SPEC))));
    }

    @TestFactory
    DynamicNode outputShouldMatchSnapshot() {
        return SnapshotTests.createTestsForSpec(SPEC);
    }

    @TestFactory
    DynamicNode outputShouldCompile() {
        return CompilerTest.createTestFromSpec(SPEC, AbstractSnapshotTest.targetDir(SPEC, "compile"));
    }

}
