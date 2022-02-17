package HomeWorkTask1Lesson8;

public class Student extends Person {

    /*
    Develop a Student class with an int field
    that matches the course the student is taking
     */

    /*
     In the Student class, create a constructor with parameters
     to initialize all fields in the class, and override the info()
     method (which would also add course information to the previous line),
     and the activity() method from the Person class. The activity()
     method should return a string value that is the type
     of activity for the corresponding Person subtype,
     for example for a student - this could be the value "I study at university".
     */

    private int course;


    public Student(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + age + course;
    }

    @Override
    public String activity() {
        return super.activity() + "I study at university ";
    }

    public class FullName {

    /*
    Develop a FullName class with the firstName and lastName fields of type String,
    which would correspond to the principle of encapsulation.
     */

        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}
