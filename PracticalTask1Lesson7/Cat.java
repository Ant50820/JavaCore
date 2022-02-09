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
        System.out.println(name + " - Miau Miau");
        return this.getName();
    }

    @Override
    public String feed() {
        System.out.println(name + " - Milk");
        return this.getName();
    }
}
