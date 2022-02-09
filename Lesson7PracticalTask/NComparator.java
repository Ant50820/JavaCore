package Lesson7PracticalTask;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class NComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((EmployeeExpl)o1).getName().compareTo(((EmployeeExpl)o2).getName());
    }
}


class TComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((EmployeeExpl)o1).getTabNumber() - ((EmployeeExpl)o2).getTabNumber();
    }


    public static void main(String[] args) {
        Set<EmployeeExpl> set = new TreeSet(EmployeeExpl.getNComparator());
        set.add(new EmployeeExpl(15, "Bob"));
        set.add(new EmployeeExpl(19, "Hot"));
        set.add(new EmployeeExpl(23, "God"));
        System.out.println(set);
        System.out.println();

        Set<EmployeeExpl> set1 = new TreeSet(EmployeeExpl.getTComparator());
        set1.addAll(set);
        System.out.println(set1);
    }
}
