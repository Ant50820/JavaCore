package Lesson7PracticalTask;

import java.util.Comparator;

public class NameComparator implements Comparator<ExempleEmployee> {

    @Override
    public int compare(ExempleEmployee o1, ExempleEmployee o2) {
        return o1.name.compareTo(o2.name);
    }
}
