package Lesson7PracticalTask;

import java.util.Comparator;

public class EmployeeExpl {

    int tabNumber;
    String name;

    public EmployeeExpl(int tabNumber, String name) {
        this.tabNumber = tabNumber;
        this.name = name;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static NComparator nComparator = new NComparator();
    static TComparator tComparator = new TComparator();

    public static Comparator getNComparator() {
        return nComparator;
    }

    public static Comparator getTComparator() {
        return tComparator;
    }



}
