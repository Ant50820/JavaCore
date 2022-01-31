package condit.statements.com;

import java.util.Scanner;

public class PracticalTask2 {

    public static void main(String[] args){

        Scanner br = new Scanner(System.in);
        System.out.println("What days do you study java? ");

        int input = br.nextInt();


        switch (input) {
            case 1:
                System.out.println("Понеділок - " + "Monday - " + "Lundi");
                break;
            case 2:
                System.out.println("Вівторок - " + "Tuesday - " + "Mardi");
                break;
            case 3:
                System.out.println("Середа - " + "Wednesday - " + "Mercredi");
                break;
            case 4:
                System.out.println("Четверг - " + "Thursday - " + "Jeudi");
                break;
            case 5:
                System.out.println("Пятниця - " + "Friday - " + "Vendredi");
                break;
            case 6:
                System.out.println("Субота - " + "Saturday - " + "Samedi");
                break;
            case 7:
                System.out.println("Неділя - " + "Sunday - " + "Dimanche");
                break;
            default:

        }
    }
}
