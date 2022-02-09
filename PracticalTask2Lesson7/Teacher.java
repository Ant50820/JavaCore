package PracticalTask2Lesson7;

public class Teacher extends Staff {

    final String TYPE_PERSON;

    public Teacher (String TYPE_PERSON) {
        super(TYPE_PERSON);
        this.TYPE_PERSON = TYPE_PERSON;
    }

    @Override
    public double salary() {
        return 0;
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
