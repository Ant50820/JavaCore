package PracticalLesson8;

public class PersonClone {

    private Person1.FullName fullName;
    private int age;



    public PersonClone(Person1.FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        //PersonClone personClone = new PersonClone(new Person1.FullName("Mike", "Green"), 25);
        Person person = new Person("Hall", "Bob", 25);
                try {
            PersonClone copOfPerson = (PersonClone) person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
