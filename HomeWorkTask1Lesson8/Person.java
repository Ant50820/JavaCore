package HomeWorkTask1Lesson8;

import PracticalLesson8.Person1;

public abstract class Person {


    /*
    Create an abstract Person class with fullName field
    of type FullName and age of type int.
     */
    public  FullName fullName;
    public int age;

    /*
    In the Person class, create a constructor
    public Person(FullName fullName, int age)
     */

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    /*
     and a method called info(), which will return a string in the format
     "First name: <firstName>, Last name: <lastName>, Age: <age>"
     */
    public String info() {
        return "First name: <firstName>, Last name: <lastName>, Age: <age>" ;
    }

    /*
     and an abstract public activity() method with a String return type.
     */
    public String activity() {
        return "";
    }
}
