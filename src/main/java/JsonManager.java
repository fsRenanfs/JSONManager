import Person.Person;
import com.google.gson.Gson;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import static sun.management.Agent.error;

public abstract class JsonManager {

    //Cast Json info in java object
    public static <T> T getJsonInfo(String filePath, Class<T> auxClass) {
        try {
            //Read Json file
            JsonReader jsonReader = Json.createReader(new InputStreamReader(new FileInputStream( new File(filePath))));
            JsonObject jobj = jsonReader.readObject();

            //Cast Json Info in class
            return new Gson().fromJson(jobj.toString(), (Type) auxClass);

        } catch (Exception e) {
            error(e.getMessage());
            return null;
        }
    }
}
