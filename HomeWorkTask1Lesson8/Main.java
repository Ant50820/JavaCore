package HomeWorkTask1Lesson8;

public class Main {

    /*-
    In the main(...) method, create two instances
    of the Student class and output information about
    them by calling the appropriate methods info() and activity().

     */
    public static void main(String[] args) {

        //Student.FullName student = new Student(3).new FullName("Hel", "Bob");

        Student student = new Student(3);
        Student.FullName personWithName = student.new FullName("Bob", "Gordon");
        student.info();


    }
}
