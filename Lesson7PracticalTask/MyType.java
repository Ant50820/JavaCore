package Lesson7PracticalTask;

public class MyType implements Comparable {

    String name;

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((MyType)o).name);
    }
}
