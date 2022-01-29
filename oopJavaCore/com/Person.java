package oopJavaCore.com;

public class Person {

    /* in this class Person we create:
    * private fields two String and one int:
    * firstName, lastName and birthYear.
    * create get and set for private fields.
    * and two constructor, first default, second with two parameters.
    * then we create methods: getAge(), input(), output() and changeName(String fn, String ln).
    *
    * */

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }


    //to calculate the age of person
    public void getAge(){

    }

    //to input information about person
    public void input(){
        System.out.println();
    }

    //to output information about person
    public void output(){

    }

    //to change the first name or/and last name of person
    public void changeName(String fn, String ln){

    }

}
