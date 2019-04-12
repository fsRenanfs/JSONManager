import Person.Person;
import com.google.gson.Gson;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        JsonManager jsonManager = new JsonManager();
        FileManager fileManager = new FileManager();
        String inputPath = "files" + File.separator + "input" + File.separator;
        String outputPath = "files" + File.separator + "output" + File.separator;

        //Get Json Info
        Person person = jsonManager.getJsonInfo(inputPath + "Person.json", Person.class);
        System.out.println(person.getPersonInfo());


        //Convert JSON to XML
        String xml = jsonManager.jsonToXML(inputPath + "PersonToConvert.json");
        fileManager.saveFile(outputPath + "newPerson.xml", xml);

        //Convert XML to JSON
        String json = jsonManager.XMLtoJson(inputPath + "nfe.xml");
        fileManager.saveFile(outputPath + "NewNFe.json", json);
    }

    public static void error(String message) {
        System.err.println("[JSON MANAGER ERROR] " + message);
    }
}
