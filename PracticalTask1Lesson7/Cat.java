package PracticalTask1Lesson7;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String voice() {
        System.out.println("Miau Miau");
        return null;
    }

    @Override
    public String feed() {
        System.out.println("Milk");
        return null;
    }
}
