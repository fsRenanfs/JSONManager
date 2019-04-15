
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

    public String jsonToXML(String filePath) throws IOException {
        //Read JSON file
        String json = new FileManager().getFileString(filePath);
        //Set object org.json lib
        JSONObject newjobj = new JSONObject(json);
        //Return XML
        return XML.toString(newjobj);
    }

    public String XMLtoJson(String filePath) throws IOException {
        //Read XML file
        String xml = new FileManager().getFileString(filePath);
        //Return JSON
        return XML.toJSONObject(xml).toString();
    }
}
