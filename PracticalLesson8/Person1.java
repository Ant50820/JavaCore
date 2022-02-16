package PracticalLesson8;

public class Person1 {
    private int age;

    public Person1(FullName fullName, int age) {
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

    public void main(String[] args) {

//        Person person = new Person(new FullName("Mile", "Green"), 25);
//        try {
//            Person1 copyOfPerson = (Person1) person.clone();
//            System.out.println("Original: " + person.getFullName() + " " +
//                    person);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }


//        Person1 person1 = new Person1(25);
//        Person1.FullName personWithName = person1.new FullName("Anton", "Last name");
//
//        Person1.FullName personWithName1 = new Person1(25).new FullName("Anton", "Last name");
//
//        personWithName.info();
//        personWithName1.info();
    }
}
