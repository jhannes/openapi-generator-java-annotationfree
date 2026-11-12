package io.github.jhannes.openapi.javaannotationfree;

import io.github.jhannes.openapi.javaannotationfree.testsupport.GeneratorTestFactory;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;

public class CompilerTest extends AbstractSnapshotTest {

    @TestFactory
    Stream<DynamicNode> outputsFromSpecsShouldCompile() throws IOException {
        List<DynamicNode> testSuites = new ArrayList<>();
        testSuites.add(compileSpec(AbstractSnapshotTest.SNAPSHOT_ROOT));
        if (Files.isDirectory(AbstractSnapshotTest.LOCAL_SNAPSHOT_ROOT.resolve("input"))) {
            testSuites.add(compileSpec(AbstractSnapshotTest.LOCAL_SNAPSHOT_ROOT));
        }
        return testSuites.stream();
    }

    DynamicNode compileSpec(Path testDir) throws IOException {
        Path inputDir = testDir.resolve("input");
        return dynamicContainer(
                "Output should compile: " + testDir,
                Files.list(inputDir).filter(p -> p.toFile().isFile()).map(CompilerTest::createTestFromSpec)
        );
    }

    public static DynamicNode createTestFromSpec(Path spec) {
        return new GeneratorTestFactory(createConfigurator(getModelName(spec)), spec, getCompileDir(spec))
                .createCompileTests();
    }
}
