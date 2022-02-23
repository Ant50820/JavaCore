package HomeWokeTask1Lesson9;

import java.nio.channels.ServerSocketChannel;
import java.util.HashSet;
import java.util.Set;

public class MainSet  {

    /*
    Write parameterized methods union
    (Set set1, Set set2) and intersect (Set set1, Set set2),
    realizing the operations of union and intersection of two sets.
    Test the operation of these techniques on two pre-filled sets.
     */

    public static void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> un = new HashSet<>(set1);
        un.addAll(set2);
        System.out.println("Union set: " + un);
    }

    public static void intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> in = new HashSet<>(set1);
        in.retainAll(set2);
        System.out.println("Intersection set: " + in);
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println("Set1: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Set2: " + set2);

        union(set1, set2);
        intersection(set1, set2);








        //set1.addAll(set2);
        //set1.retainAll(set2);
        //System.out.println("Union is: " + set1);
        //System.out.println("Intersection is: " + set1);


    }
}
