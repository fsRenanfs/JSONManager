import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    public void saveFile(String path, String fileInfo) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(fileInfo);
        fw.flush();
        fw.close();
    }

    public String getFileString(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
