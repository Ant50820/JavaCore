package HomeWorkTask1Lesson8;

public class Main {

    /*-
    In the main(...) method, create two instances
    of the Student class and output information about
    them by calling the appropriate methods info() and activity().

     */
    public static void main(String[] args) {


        Student student = new Student(new FullName("Himan", "Manhall"), 29, 3);


        System.out.println(student.info());
        System.out.println(student.activity());




    }
}
