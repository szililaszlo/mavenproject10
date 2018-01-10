import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

       /* try {
            Person person = objectMapper.readValue(new File("C:\\Users\\Helix3\\IdeaProjects\\" +
                    "mavenproject\\src\\main\\resources\\data.json"), Person.class);
            System.out.println(person);

        } catch (IOException e) {
            e.printStackTrace();
        }

*/

    /*   try {
           PersonCar personCar = objectMapper.readValue(new File("C:\\Users\\Helix3\\IdeaProjects\\" +
                   "mavenproject\\src\\main\\resources\\example.json"), PersonCar.class);
           System.out.println(personCar);
       }

       catch (IOException e) {
           e.printStackTrace();
       }

*/

        try {
            Employee employee = objectMapper.readValue(new File("C:\\Users\\Helix3\\IdeaProjects\\" +
                    "mavenproject\\src\\main\\resources\\employee.json"), Employee.class);
            System.out.println(employee);
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
