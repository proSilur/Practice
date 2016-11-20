package four;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("json.txt");

        Gson gson = new GsonBuilder().create();
        Person person = gson.fromJson(reader, Person.class);

        System.out.println(person.toString());
    }


}
