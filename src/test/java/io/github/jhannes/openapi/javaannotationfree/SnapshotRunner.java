package io.github.jhannes.openapi.javaannotationfree;

import difflib.Delta;
import difflib.DiffUtils;
import difflib.Patch;
import org.openapitools.codegen.ClientOptInput;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SnapshotRunner {

    private final Path output;
    private final Path input;
    private final Path snapshotDir;

    public SnapshotRunner(Path testDir) {
        output = testDir.resolve("output");
        input = testDir.resolve("input");
        snapshotDir = testDir.resolve("snapshot");
    }

    public static void main(String[] args) throws IOException {
        new SnapshotRunner(Paths.get("snapshotTests")).run();
        new SnapshotRunner(Paths.get("localSnapshotTests")).run();
    }

    private void run() throws IOException {
        if (!Files.isDirectory(input)) {
            return;
        }
        if (Files.isDirectory(output)) {
            try (Stream<Path> walk = Files.walk(output)) {
                walk.sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .peek(System.out::println)
                        .forEach(File::delete);
            }
        }


        Files.list(input).forEach(this::generate);

        try (Stream<Path> list = Files.walk(output)) {
            list.forEach(file -> {
                Path snapshotFile = snapshotDir.resolve(output.relativize(file));

                if (!Files.exists(snapshotFile)) {
                    System.err.println("Missing " + snapshotFile);
                } else if (Files.isRegularFile(file) && !file.toString().endsWith(".jar")) {

                    try {
                        Patch<String> diff = DiffUtils.diff(Files.readAllLines(file), Files.readAllLines(snapshotFile));
                        List<Delta<String>> deltas = diff.getDeltas();
                        for (Delta<String> delta : deltas) {
                            System.err.println(file + " differs");
                            System.out.println(delta);
                        }
                        if (deltas.isEmpty()) {
                            System.out.println(file + " is identical");
                        }

                    } catch (IOException e) {
                        System.err.println("Threw exception for " + file);
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void generate(Path file) {
        String filename = file.getFileName().toString();
        int lastDot = filename.lastIndexOf('.');
        String modelName = lastDot < 0 ? filename : filename.substring(0, lastDot);

        final CodegenConfigurator configurator = new CodegenConfigurator()
                .setGeneratorName("java-annotationfree")
                .setInputSpec(file.toString())
                .setModelNameSuffix("Dto")
                .setPackageName("io.github.jhannes.openapi." + modelName)
                .setModelPackage("io.github.jhannes.openapi." + modelName + ".model")
                .setApiPackage("io.github.jhannes.openapi." + modelName + ".api")
                .addAdditionalProperty("generateModelTests", "true")
                .addAdditionalProperty("hideGenerationTimestamp", "true")
                .setOutputDir(output.resolve(modelName).toString());

        final ClientOptInput clientOptInput = configurator.toClientOptInput();
        DefaultGenerator generator = new DefaultGenerator();
        generator.opts(clientOptInput).generate();
    }
}
