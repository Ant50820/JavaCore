package PracticalTask2Lesson7;

public class Main {
    /*
    Create array of Person and add some
    Teachers, Cleaners and Students to it.
    Call method print() for all of it.
    Call method salary() for all Teachers and Cleaner
     */

    public static void main(String[] args) {

        Person[] people = new Person[3];
        people[0] = new Student("Student");
        people[1] = new Teacher("Teacher");
        people[3] = new Cleaner("Cleaner");



    }
}
