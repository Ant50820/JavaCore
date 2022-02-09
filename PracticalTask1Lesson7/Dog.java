package PracticalTask1Lesson7;

public class Dog  implements  Animal {
    /*
     Create two classes Dog, which implement this interface
     */


    String name;

    public Dog(String name) {
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
        //System.out.println(name + " - Gav Gav");
        return this.getName() + " - Gav Gav, ";
    }

    @Override
    public String feed() {
        //System.out.println(name + " - Meat");
        return this.getName() + " - Meat, ";
    }
}
