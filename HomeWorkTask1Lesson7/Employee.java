package HomeWorkTask1Lesson7;

public class Employee {

    /*
    the base class Employee with a string variable employeeld.
     */

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String report() {
        //System.out.println(name + " - " + age  + " - " + salary);
        return String.format("Name: " + name + " Age: " + age + " Salary: " + salary );
    }

}
