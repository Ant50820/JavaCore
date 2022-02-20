package PractikalTask1Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> myCollection = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            String s = bf.readLine();
            myCollection.add(Integer.parseInt(s));
        }

        System.out.println(myCollection);

        Iterator<Integer> iterator = myCollection.iterator();

        /*
        Remove from collection myCollection elements,
        which are greater then 20.
         */
        myCollection.removeIf(integer -> integer > 20); // incredible magic %))
        System.out.println(myCollection); //Print result














//        List<Integer> newCollection = new LinkedList<>();
//
//        Iterator<Integer> iterator = myCollection.iterator();
//
    }
}
//
//    List<Integer> newCollection = new LinkedList<>();
//
//    Iterator<Integer> iterator = myCollection.iterator();
//    int i = 0;
//        while (iterator.hasNext()) {
//                Integer ch = iterator.next();
//                if (ch > 5) {
//                newCollection.add(i);
//                i++;
//                }
//                }
//                System.out.println(newCollection);











//        Iterator<Integer> iterator = myCollection.iterator();

//        for (Integer integer : myCollection) {
//            String s = bf.readLine();
//            if (integer.intValue() > 20) {
//                myCollection.remove(s);
//            }
//        }
