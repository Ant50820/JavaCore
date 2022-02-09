package HomeWorkTask1Lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        Create an array of employees and
        add the employees with different form of payment.
         */

        /*
        Arrange the entire sequence of workers descending the average monthly wage.
        Output the employee ID, name,
        and the average monthly wage for all elements of the list.
         */


        //List Salary Employee
        List<SalarieEmployee> list = new ArrayList<SalarieEmployee>();

        list.add(new SalarieEmployee("Bob", 37, 200.0, "1", 2000.2));
        list.add(new SalarieEmployee("Gor", 32, 200.3, "2", 1900.5));
        list.add(new SalarieEmployee("Jim", 33, 190.5, "3", 2100.6));


        //List Contract Employee
        List<ContractEmployee> list1 = new ArrayList<ContractEmployee>();

        list1.add(new ContractEmployee("Hor", 37, 210.2, 35, 160));
        list1.add(new ContractEmployee("Pop", 27, 140.3, 35, 160));
        list1.add(new ContractEmployee("Dock", 25, 300.3, 30, 160));


        //Sort Average monthly wage
        list1.sort(new CalculetCamparator());
        for (ContractEmployee contractEmployee : list1) {
            String emp = contractEmployee.report();
            System.out.println(emp);
        }

        System.out.println("------------------");

        //Sort Fixed monthly payment
        list.sort(new Calculet2Camparator());
        for (SalarieEmployee salarieEmployee : list) {
            String em = salarieEmployee.report();
            System.out.println(em);
        }










    }
}
