package HomeWorkTask2Lesson9;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args)  {

        /*
        Create map personMap and add to it ten persons
        of type <String, String> (lastName, firstName).
        Output the entities of the map on the screen.
         */

        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Lui", "Lyi");
        personMap.put("Jik", "Bob");
        personMap.put("Mik", "Neo");
        personMap.put("Frik", "LYi");
        personMap.put("Fun", "Jon");
        personMap.put("Hol", "Prin");
        personMap.put("WWW", "Cocon");
        personMap.put("Chui", "Hui");
        personMap.put("Ivanov", "Vova");
        personMap.put("Luisian", "Orest");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("lastName - " + entry.getKey()  + " : " + "firstName - " +  entry.getValue());
        }
        System.out.println("--------------------------------------");
    }




}
