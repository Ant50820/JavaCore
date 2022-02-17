package HomeWorkTask1Lesson8;

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
