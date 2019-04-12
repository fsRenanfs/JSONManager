import Person.Person;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.*;
import java.lang.reflect.Type;


public class JsonManager {

    //Cast Json info in java object
    public <T> T getJsonInfo(String filePath, Class<T> auxClass) {
        try {
            //Read Json file
            JsonReader jsonReader = Json.createReader(new InputStreamReader(new FileInputStream(new File(filePath))));
            JsonObject jobj = jsonReader.readObject();

            //Cast Json Info in class
            return new Gson().fromJson(jobj.toString(), (Type) auxClass);

        } catch (Exception e) {
            main.error(e.getMessage());
            return null;
        }
    }

    public String jsonToXML(String filePath) throws FileNotFoundException {
        String xml;

        //Read Json
        JsonReader jsonReader = Json.createReader(new InputStreamReader(new FileInputStream(new File(filePath))));
        //Set object
        JsonObject jobj = jsonReader.readObject();
        //Set object org.json lib
        JSONObject newjobj = new JSONObject(jobj.toString());
        //Return XML
        xml = XML.toString(newjobj);

        return xml;
    }

    public String XMLtoJson(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String line, json, xml = "";

        while ((line = br.readLine()) != null)
            xml += line;
        br.close();
        json = XML.toJSONObject(xml).toString();

        return json;
    }
}
