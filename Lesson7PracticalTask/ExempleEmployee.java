package Lesson7PracticalTask;

public class ExempleEmployee {


    String name;
    int tabNumber;

    public ExempleEmployee( String name, int tabNumber) {
        this.name = name;
        this.tabNumber = tabNumber;
    }

    @Override
    public String toString() {
        return "ExempleEmployee{" +
                "tabNumber=" + name +
                ", name='" +  tabNumber + '\'' +
                '}';
    }
}
