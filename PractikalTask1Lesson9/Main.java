package PractikalTask1Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Collections.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> myCollection = new ArrayList<>(10); // Create an ArrayList object


        for (int i = 0; i < 10; i++) {
            String s = bf.readLine();
            myCollection.add(Integer.parseInt(s));

        }

        System.out.println(myCollection);
        myCollection.add(2, 1);
        myCollection.add(5, -3);
        myCollection.add(8, -4);
        System.out.println("After insert elements: " + myCollection);
        System.out.println("Size list: " + myCollection.size());


        System.out.println("Position elements after Insert elements = "
                + myCollection.get(2)
                + ", " + myCollection.get(5)
                + ", " + myCollection.get(8));// Result position after insert elements

        Collections.sort(myCollection); // Sort myCollection
        for (int integer : myCollection) {
            System.out.println(integer);
        }
    }

}



//2
        /**
        Remove from collection myCollection elements,
        which are greater then 20.
         */
        //myCollection.removeIf(integer -> integer > 20); // incredible magic %))
        //System.out.println(myCollection); //Print result





//1

//        List<Integer> newCollection = new LinkedList<>(); // Create an ArrayList object
//
//        Iterator<Integer> iterator = myCollection.iterator();
//


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











