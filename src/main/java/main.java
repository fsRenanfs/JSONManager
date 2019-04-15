
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        JsonManager jsonManager = new JsonManager();
        String command = args[0];
        String inputFile = args[1], outputFile = args[2];

        switch (command.toUpperCase()) {
            //Convert XML to JSON
            case "--XML":
                jsonManager.XMLtoJson(inputFile, outputFile);
                break;
            //Convert JSON to XML
            case "--JSON":
                jsonManager.jsonToXML(inputFile, outputFile);
                break;
            default:
                error("Informe o tipo de arquivo a ser convertido: " +
                        "\n--JSON convert to JSON to XML" +
                        "\n--XML convert XML to JSON");
        }
    }

    public static void error(String message) {
        System.err.println("[JSON MANAGER ERROR] " + message);
    }
}
