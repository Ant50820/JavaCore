package Lesson7PracticalTask;

import java.util.ArrayList;
import java.util.List;

public class MainExampel {

    public static void main(String[] args) {

        List<ExempleEmployee> list = new ArrayList<ExempleEmployee>();

        list.add(new ExempleEmployee ("Bob", 12));
        list.add(new ExempleEmployee ("Rob", 2));
        list.add(new ExempleEmployee ("Gob", 9));
        list.add(new ExempleEmployee ("Pob", 1));

        list.sort(new NameComparator());
        for (ExempleEmployee exempleEmployee : list) {
            System.out.println(exempleEmployee);
        }

        System.out.println(" Second sort ===============");

        list.sort(new TabComparator());
        for (ExempleEmployee exempleEmployee : list) {
            System.out.println(exempleEmployee);
        }
    }
}
