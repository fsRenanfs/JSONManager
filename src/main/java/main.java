
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        JsonManager jsonManager = new JsonManager();
        FileManager fileManager = new FileManager();
        String inputFile = args[0], outputFile = args[1];

        //Convert JSON to XML
        if (inputFile.contains(".json")) {
            String xml = jsonManager.jsonToXML(inputFile);
            fileManager.saveFile(outputFile, xml);
        }
        //Convert XML to JSON
        else if (inputFile.contains(".xml")) {
            String json = jsonManager.XMLtoJson(inputFile);
            fileManager.saveFile(outputFile, json);
        }
    }

    public static void error(String message) {
        System.err.println("[JSON MANAGER ERROR] " + message);
    }
}
