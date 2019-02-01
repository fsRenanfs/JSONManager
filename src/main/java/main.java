import Person.Person;
import com.google.gson.Gson;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Person person = JsonManager.getJsonInfo("Person.json", Person.class);
        System.out.println(person.getPersonInfo());
    }

    public static void error(String message) {
        System.out.println("[JSON MANAGER ERROR] " + message);
    }
}
