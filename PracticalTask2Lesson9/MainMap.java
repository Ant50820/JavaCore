package PracticalTask2Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.*;

public class MainMap {

    public static void main(String[] args) throws IOException {

        /*
        In the main() method declare map employeeMap of pairs <Integer, String>.
         */

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);
        Map<Integer, String>  employeeMap = new HashMap<Integer, String>();

        employeeMap.put(1, "Bob");
        employeeMap.put(2, "Gob");
        employeeMap.put(3, "Sob");
        employeeMap.put(4, "Kob");
        employeeMap.put(5, "Lob");
        employeeMap.put(6, "Wob");
        employeeMap.put(7, "Nob");

        //Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID " + entry.getKey()  + " : " + "Name " +  entry.getValue());
        }
        System.out.println("--------------------------------------");

        /*
        Ask user to enter ID, then find and write
        corresponding name from your map. If you can't
        find this ID - say about it to user (use function containsKey()).
         */
//        int id = scanner.nextInt();
//        for (Iterator i = employeeMap.entrySet().iterator(); i.hasNext();) {
//            Map.Entry entry = (Map.Entry) i.next();
//
//            if (employeeMap.containsKey(id)) {
//                System.out.println(employeeMap.get(id));
//
//            } else {
//                System.out.println("False");
//            }
//            break;
//        }


        /*
        Ask user to enter name, verify than you have
        name in your map and write corresponding ID.
        If you can't find this name - say about it
        to user (use function containsValue()).
         */
        String name = scanner.nextLine();
        for (Iterator i = employeeMap.entrySet().iterator(); i.hasNext();) {
            Map.Entry entry = (Map.Entry) i.next();

            if (employeeMap.containsValue(name)) {
                System.out.println(employeeMap.get(name));
            } else {
                System.out.println("False");
            }
            break;
        }
    }


}
