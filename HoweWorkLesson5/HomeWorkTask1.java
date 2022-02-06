package HoweWorkLesson5;

import java.util.Scanner;

public class HomeWorkTask1 {

    /*
    Ask user to enter the number of month.
    Read the value and write the amount of days in this month
     */

    private String nameMonth;
    private int numberMonth;
    private int countDay;

    public HomeWorkTask1(String nameMonth, int numberMonth, int numberDay) {
        this.nameMonth = nameMonth;
        this.numberMonth = numberMonth;
        this.countDay = numberDay;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public void setNumberMonth(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    public static void main(String[] args) {

        /*
        Create array with amount days of each month.
         */
        Scanner scanner = new Scanner(System.in);
        int numM;

        HomeWorkTask1[] month = new HomeWorkTask1[12];

        month[0] = new HomeWorkTask1("January", 1, 31);
        month[1] = new HomeWorkTask1("February", 2, 28);
        month[2] = new HomeWorkTask1("March", 3, 31);
        month[3] = new HomeWorkTask1("April", 4, 30);
        month[4] = new HomeWorkTask1("May", 5, 31);
        month[5] = new HomeWorkTask1("June", 6, 30);
        month[6] = new HomeWorkTask1("July", 7, 31);
        month[7] = new HomeWorkTask1("August", 8, 31);
        month[8] = new HomeWorkTask1("September", 9, 30);
        month[9] = new HomeWorkTask1("October", 10, 31);
        month[10] = new HomeWorkTask1("November", 11, 30);
        month[11] = new HomeWorkTask1("December", 12, 31);

        System.out.println("**** Input number month ****");

        numM = Integer.parseInt(scanner.nextLine());

        for (HomeWorkTask1 m : month) {
            if (m.getNumberMonth() == numM) {
                System.out.println(m.getNameMonth() + " - days " + m.getCountDay() );
            }
        }
    }




}
