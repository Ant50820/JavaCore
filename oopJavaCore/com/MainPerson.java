package oopJavaCore.com;

public class MainPerson {

    /*
    * In the method main() create 5 objects of Person
    * type and input information about them.
    * */
    public static void main(String[] args) {



        Person person1 = new Person();
        System.out.println("------------------------------------------------");
        System.out.println("The first Person: Please First Name enter Last Name enter and Birth Year enter");
        person1.input();
        person1.output();
        person1.getAge();

        System.out.println("The second Person: Please First Name enter Last Name enter and Birth Year enter");
        System.out.println("------------------------------------------------");
        Person person2 = new Person();
        person2.input();
        person2.output();
        person2.getAge();

        System.out.println("The third Person: Please First Name enter Last Name enter and Birth Year enter");
        System.out.println("------------------------------------------------");
        Person person3 = new Person();
        person3.input();
        person3.output();
        person3.getAge();

        System.out.println("The fourth Person: Please First Name enter Last Name enter and Birth Year enter");
        System.out.println("------------------------------------------------");
        Person person4 = new Person();
        person4.input();
        person4.output();
        person4.getAge();

        System.out.println("The fifth Person: Please First Name enter Last Name enter and Birth Year enter");
        System.out.println("------------------------------------------------");
        Person person5 = new Person();
        person5.input();
        person5.output();
        person5.getAge();

        person1.changeName("Viliam", "Emington");
        person2.changeName("Josh", "Musil");
        person3.changeName("Bob", "Linua");
        person4.changeName("Sam", "Jungle");
        person5.changeName("Judy", "Jonsone");





//        Person person1 = new Person();
//        person1.setFirstName("Viliam");
//        person1.setLastName("Emington");
//        person1.setBirthYear(1984);
//
//        Person person2 = new Person();
//        person2.setFirstName("Josh");
//        person2.setLastName("Musil");
//        person2.setBirthYear(1991);
//
//        Person person3 = new Person("Bob","Linau");
//        person3.setBirthYear(1982);
//
//        Person person4 = new Person("Sam","Jungle");
//        person4.setBirthYear(1979);
//
//
//        Person person5 = new Person();
//        person5.setFirstName("Judy");
//        person5.setLastName("Jonsone");
//        person5.setBirthYear(1992);
//
//
//        System.out.println("------------------------------------------------");
//        System.out.println(person1);
//        person1.getAge();
//        System.out.println("------------------------------------------------");
//
//
//        System.out.println(person2);
//        person2.getAge();
//        System.out.println("------------------------------------------------");
//
//        System.out.println(person3);
//        person3.getAge();
//        System.out.println("------------------------------------------------");
//
//        System.out.println(person4);
//        person4.getAge();
//        System.out.println("------------------------------------------------");
//
//        System.out.println(person5);
//        person5.getAge();
//        System.out.println("------------------------------------------------");


    }



}
