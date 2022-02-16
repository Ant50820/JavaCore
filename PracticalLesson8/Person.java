package PracticalLesson8;

public class Person implements Cloneable{
    private FullName fullName = new FullName();
    private int age;

    public Person(FullName fullName, int age) {
    }

//    public Person(Person1.FullName fullName, int i) {
//
//    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, String lastName, int age) {
         fullName.firstName = firstName;
         fullName.lastName = lastName;
         this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private static class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public FullName() {

        }
    }



    public static void main(String[] args) {

        Person person = new Person(new FullName("Mike", "Green"), 25);

        try {
            Person copyOfPerson = (Person) person.clone();
            //copyOfPerson.setAge(25);
            System.out.println("Original: " + person.fullName.firstName + " " +
                    person.fullName.lastName + " " + person.age);
            System.out.println("Cloned: ");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

//        Person person1 = new Person("Bob", "Penn", 25);
//
//        //error
//        //String fullName1 = person.getFullName();
//        int age = person1.getAge();
//        System.out.println(", " + age);


    }
}

