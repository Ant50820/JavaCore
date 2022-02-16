package PracticalLesson8;

public class Person1 {
    private int age;

    public Person1(int age) {
        this.age = age;
    }

    public class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void info() {
            System.out.println(firstName + " " + lastName + ", " + age + " years old");
        }
    }

    public static void main(String[] args) {
        Person1 person1 = new Person1(25);
        Person1.FullName personWithName = person1.new FullName("Anton", "Last name");

        Person1.FullName personWithName1 = new Person1(25).new FullName("Anton", "Last name");

        personWithName.info();
        personWithName1.info();
    }
}
