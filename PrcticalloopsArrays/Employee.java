package PrcticalloopsArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    /*
    Create a class Employee with fields name,
    department number, salary.
     */

    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        /*
        Create five objects of class Employee
         */
        Scanner scanner = new Scanner(System.in);
        int dep;

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Bob", 1, 1300.50);
        employees[1] = new Employee("Jack", 2, 1400.50);
        employees[2] = new Employee("Tom", 2, 1800.50);
        employees[3] = new Employee("Rick", 1, 1900.50);
        employees[4] = new Employee("Jam", 2, 1500.50);

        System.out.println("Input dep");

        //all employees of a certain department
        // (enter department number in the console);
        dep = Integer.parseInt(scanner.nextLine());
        for (Employee e : employees) {
            if (e.getDepartmentNumber() == dep) {
                System.out.println(e.getName());
            }
        }
        System.out.println("************************");

        //arrange workers by the field salary in descending order.
        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }







        //        for (int i = 0; i < employees.length; i++) {
//            name = scanner.nextLine();
//            dep = Integer.parseInt(scanner.nextLine());
//            salary = Double.parseDouble(scanner.nextLine());
//            employees[i] = new Employee(name, dep, salary);
//        }








//        Employee employee1 = new Employee("Bob", 5, 1300.50);
//        Employee employee2 = new Employee("Jack", 5, 1400.50);
//        Employee employee3 = new Employee("Tom", 5, 1800.50);
//        Employee employee4 = new Employee("Rick", 5, 1900.50);
//        Employee employee5 = new Employee("Jam", 5, 1500.50);




    }

}
