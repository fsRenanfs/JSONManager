
import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;
import java.lang.reflect.Type;


public class JsonManager {

    //Cast Json info in java object
    public <T> T getJsonInfo(String filePath, Class<T> auxClass) {
        try {
            //Read Json file
            String json = new FileManager().getFileString(filePath);

            //Cast Json Info in class
            return new Gson().fromJson(json, (Type) auxClass);

        } catch (Exception e) {
            main.error(e.getMessage());
            return null;
        }
    }

    public void jsonToXML(String filePath, String outputPath) throws IOException {
        FileManager fileManager = new FileManager();
        //Read JSON file
        String json = fileManager.getFileString(filePath);
        //Set object org.json lib
        JSONObject newjobj = new JSONObject(json);
        //save XML file
        fileManager.saveFile(outputPath, XML.toString(newjobj));
    }

    public void XMLtoJson(String filePath, String outputPath) throws IOException {
        FileManager fileManager = new FileManager();
        //Read XML file
        String xml = new FileManager().getFileString(filePath);
        //save JSON file
        fileManager.saveFile(outputPath, XML.toJSONObject(xml).toString());
    }
}
