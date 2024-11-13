package logic.config.filepath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePath {

    public static final String FILE_PATH_MARKOV_CHAIN = getOutputPath("markov_chain.png");
    public static final String FILE_PATH_STRING_CONTENT = getOutputPath("example.txt");

    private static String getOutputPath(String filename) {
        Path outputPath = Paths.get("src", "main", "java", "output");
        try {
            Files.createDirectories(outputPath);
        } catch (IOException e) {
            throw new RuntimeException("Could not create output directory", e);
        }

        return outputPath.resolve(filename).toString();
    }
}
