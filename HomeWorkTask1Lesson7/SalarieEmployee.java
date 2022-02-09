package HomeWorkTask1Lesson7;

public class SalarieEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalarieEmployee(String name, int age, double salary, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(name, age, salary);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    //Calculate fixed paid
    @Override
    public double calculatePay() {
        return (fixedMonthlyPayment * getSalary()) + 100;
    }

    @Override
    public String report() {
        return " Average monthly wage = " + calculatePay() + super.report() + " Social security number: "
                + getSocialSecurityNumber()
                +  " Fixed monthly payment: " + getFixedMonthlyPayment();
    }
}
