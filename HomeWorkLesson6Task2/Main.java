package HomeWorkLesson6Task2;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Amiliy", 30, 2001.3);
        Employee employee2 = new Employee("Ama", 31, 2001.3);
        Employee employee3 = new Employee("Ami", 32, 2001.3);
        Employee employee4 = new Employee("Am", 33, 2001.3);
        System.out.println(employee1.report());
        System.out.println(employee2.report());
        System.out.println(employee3.report());
        System.out.println(employee4.report());


       Developer developer1 = new Developer("Anton", 37, 2000.3, "Jav dev");
       Developer developer2 = new Developer("Fany", 39, 2001.3, "Jav dev");
       Developer developer3 = new Developer("Bunny", 32, 2002.3, "Jav dev");
        System.out.println(developer1.report());
        System.out.println(developer2.report());
        System.out.println(developer3.report());







    }
}
