package PracticalTask2Lesson7;

public abstract class Staff extends Person{
    /*
     In class Staff declare abstract method salary().
     In each concrete class create constant TYPE_PERSON.
      Output type of person in each constructors.
     */

    protected final String TYPE_PERSON;

    protected Staff(String type_person) {
        this.TYPE_PERSON = type_person;
    }

    public abstract double salary();

}
