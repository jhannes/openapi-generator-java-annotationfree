package io.github.jhannes.openapi.typescriptfetchapi;

import org.openapitools.codegen.config.CodegenConfigurator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class AbstractSnapshotTest {
    public static final Path SNAPSHOT_ROOT = Paths.get("snapshotTests");
    public static final Path LOCAL_SNAPSHOT_ROOT = Paths.get("localSnapshotTests");

    protected static CodegenConfigurator createConfigurator(String modelName, Path spec, Path outputDir) {
        try {
            if (spec.getFileName().toString().endsWith(".link")) {
                spec = Paths.get(Files.readAllLines(spec).get(0));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new CodegenConfigurator()
                .setGeneratorName("java-annotationfree")
                .setInputSpec(spec.toString().replaceAll("\\\\", "/"))
                .setModelNameSuffix("Dto")
                .setPackageName("io.github.jhannes.openapi." + modelName)
                .setModelPackage("io.github.jhannes.openapi." + modelName + ".model")
                .setApiPackage("io.github.jhannes.openapi." + modelName + ".api")
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .addAdditionalProperty("generateSupportingFiles", "true")
                .addAdditionalProperty("generateModelTests", "true")
                .addAdditionalProperty("generateApis", "false")
                .addAdditionalProperty("dateLibrary", "java8")
                .setOutputDir(outputDir.toString());
    }

    static void cleanDirectory(Path directory) throws IOException {
        if (Files.isDirectory(directory)) {
            System.out.println("rm -r " + directory);
            try (Stream<Path> walk = Files.walk(directory)) {
                walk.sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
            }
        }
    }
}
