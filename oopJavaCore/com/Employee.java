package oopJavaCore.com;

public class Employee {

    private String name;
    private int rate;
    private int hours;

    public static int totalSum;

    public Employee(){}
    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public  Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void getSalary(){
        int Sum = rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public void changeRate(int rate) {


    }

    public void getBonuses(){

    }
}
