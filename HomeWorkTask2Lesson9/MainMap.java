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
        personMap.put("Hol", "Neo");
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




        //Remove from the map person whose firstName is ”Orest” (or other). Print result.
        for (Map.Entry<String, String> entry : personMap.entrySet()) {

            if (entry.equals("Hol")) {
                personMap.remove("Hol");
            }
            System.out.println("lastName - " + entry.getKey() + " : " + "firstName - " + entry.getValue());
        }

        System.out.println("***************************");



        for (String s : personMap.keySet()) {
            if (s.equals(personMap.get("Hol"))) {
                personMap.remove("Hol");
            }
            System.out.println(s + " ");
        }
    }
}
