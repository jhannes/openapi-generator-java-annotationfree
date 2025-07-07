package io.github.jhannes.openapi.javaannotationfree;

import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.opentest4j.AssertionFailedError;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

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

    public static String getInputSpec(Path input) {
        if (!input.getFileName().toString().endsWith(".link")) {
            return input.toString();
        }
        String path = readFirstLine(input).trim();
        if (path.matches("https?://.*")) {
            return path;
        }
        String[] parts = path.split("\\s+");
        if (parts.length == 1) {
            return Paths.get(path).toString().replaceAll("\\\\", "/");
        } else {
            return Paths.get(parts[0]).resolve(parts[1]).toString().replaceAll("\\\\", "/");
        }
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

    private static Optional<Path> getBasePath(Path spec) {
        if (spec.getFileName().toString().endsWith(".link")) {
            String path = readFirstLine(spec).trim();
            if (path.matches("https?://.*")) {
                return Optional.empty();
            }
            String[] parts = path.split("\\s+");
            if (parts.length == 1) {
                return Optional.empty();
            } else {
                return Optional.of(Paths.get(parts[0]));
            }
        } else {
            return Optional.empty();
        }
    }

    static void cleanDirectory(Path directory) throws IOException {
        if (Files.isDirectory(directory)) {
            try (Stream<Path> walk = Files.walk(directory)) {
                walk.sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
            }
        }
    }

    protected static String getModelName(Path file) {
        String filename = file.getFileName().toString();
        int lastDot = filename.lastIndexOf('.');
        return lastDot < 0 ? filename : filename.substring(0, lastDot);
    }

    private static String readFirstLine(Path spec) {
        try {
            return Files.readAllLines(spec).get(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void generate(CodegenConfigurator configurator) {
        try {
            NumberFormat.getInstance().parse("-1000");
        } catch (ParseException e) {
            throw new AssertionFailedError(
                    "Can't parse enums with negative numbers when Locale is " + Locale.getDefault(Locale.Category.FORMAT)
                            + ". Run with -Duser.language.format=en to avoid this error. "
                            + "The error is due to a bug in swagger: https://github.com/swagger-api/swagger-core/pull/4178"
            );
        }
        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        generator.opts(clientOptInput).generate();
    }
}
