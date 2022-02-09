package PracticalTask2Lesson7;

public class Main {
    /*
    Create array of Person and add some
    Teachers, Cleaners and Students to it.
    Call method print() for all of it.
    Call method salary() for all Teachers and Cleaner
     */

    public static void main(String[] args) {

        Person[] people = new Person[6];
        people[0] = new Student("Master student ");
        people[1] = new Student("Bachelor student ");
        people[2] = new Teacher("Teacher Math ");
        people[3] = new Teacher("Computer science teacher ");
        people[4] = new Cleaner("Cleaner server rooms ");
        people[5] = new Cleaner("Cleaner computer rooms ");





        for (Person person : people) {
            String pel = person.print();
            System.out.println(pel);
        }








    }
}
