import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public void saveFile(String path, String fileInfo) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(fileInfo);
        fw.flush();
        fw.close();
    }
}
