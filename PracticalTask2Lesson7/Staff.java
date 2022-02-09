package PracticalTask2Lesson7;

public abstract class Staff extends Person{

    public final String TYPE_PERSON;
    protected Staff(String type_person) {
        TYPE_PERSON = type_person;
    }

    public abstract double salary();

}
