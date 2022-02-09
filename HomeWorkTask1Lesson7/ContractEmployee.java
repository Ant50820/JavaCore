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

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Calculate hourly paid
    @Override
    public double calculatePay() {
        return hourlyRate * getNumberOfHoursWorked() + getSalary();
    }

    @Override
    public String report() {
        return " Average monthly wage = " + calculatePay() + super.report()
                + " Number of hours worked: " + getNumberOfHoursWorked()
                + " Hourly rate: " + getHourlyRate();
    }
}
