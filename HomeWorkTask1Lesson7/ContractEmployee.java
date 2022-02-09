package HomeWorkTask1Lesson7;

public class ContractEmployee extends Employee implements Payment {

    private int numberOfHoursWorked;
    private int hourlyRate;

    public ContractEmployee(String name, int age, double salary, int numberOfHoursWorked, int hourlyRate) {
        super(name, age, salary);
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    // Calculate hourly paid
    @Override
    public double calculatePay() {
        return hourlyRate * getNumberOfHoursWorked();
    }
}
