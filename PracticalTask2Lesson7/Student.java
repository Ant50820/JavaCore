package PracticalTask2Lesson7;

public class Student extends Person {

    final String TYPE_PERSON;

    public Student(String TYPE_PERSON) {
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
    public String print() {
        return "I am a " + TYPE_PERSON;
    }
}



//private String name;
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

