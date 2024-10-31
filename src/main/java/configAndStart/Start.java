package configAndStart;

import logic.config.filepath.FilePath;
import logic.stringcontent.StringContent;
import logic.util.Writer;

public class Start {
    public static void main(String[] args) {
        Writer.writeToTxtFile(FilePath.FILE_PATH_STRING_CONTENT, StringContent.getContent());
        Writer.writeToPngGraph(FilePath.FILE_PATH_MARKOV_CHAIN);
    }
}
