package Lesson7PracticalTask;

import java.util.Comparator;

public class TabComparator implements Comparator <ExempleEmployee> {
    @Override
    public int compare(ExempleEmployee o1, ExempleEmployee o2) {
        return o1.tabNumber - o2.tabNumber;
    }
}
