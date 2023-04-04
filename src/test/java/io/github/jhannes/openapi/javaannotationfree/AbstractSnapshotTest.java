package io.github.jhannes.openapi.javaannotationfree;

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

    protected static CodegenConfigurator createConfigurator(String modelName, Path input, Path outputDir) {
        return createBaseConfigurator(modelName, input, outputDir)
                .setGeneratorName("java-annotationfree");
    }

    static CodegenConfigurator createBaseConfigurator(String modelName, Path input, Path outputDir) {
        return createBaseConfigurator(modelName)
                .setInputSpec(getInputSpec(input))
                .setOutputDir(outputDir.toString());
    }

    private static CodegenConfigurator createBaseConfigurator(String modelName) {
        return createBaseConfigurator()
                .setPackageName("io.github.jhannes.openapi." + modelName)
                .setModelPackage("io.github.jhannes.openapi." + modelName + ".model")
                .setApiPackage("io.github.jhannes.openapi." + modelName + ".api");
    }

    private static CodegenConfigurator createBaseConfigurator() {
        return new CodegenConfigurator()
                .setModelNameSuffix("Dto")
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .addAdditionalProperty("generateSupportingFiles", "true")
                .addAdditionalProperty("generateModelTests", "true")
                .addAdditionalProperty("generateApis", "true")
                .addAdditionalProperty("dateLibrary", "java8");
    }

    private static String getInputSpec(Path input) {
        String spec = input.toString();
        try {
            if (input.getFileName().toString().endsWith(".link")) {
                String path = Files.readAllLines(input).get(0);
                if (path.matches("https?://.*")) {
                    spec = path;
                } else {
                    spec = Paths.get(path).toString();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return spec.replaceAll("\\\\", "/");
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

    protected static Path getRootDir(Path spec) {
        return spec.getParent().getParent();
    }
}
