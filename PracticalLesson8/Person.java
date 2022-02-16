package PracticalLesson8;

public class Person {
    private FullName fullName = new FullName();
    private int age;

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

    private class FullName {
        private String firstName;
        private String lastName;
    }



    public static void main(String[] args) {

        Person person = new Person("Bob", "Penn", 25);

        //error
        //String fullName1 = person.getFullName();
        int age = person.getAge();
        System.out.println(", " + age);


    }
}

