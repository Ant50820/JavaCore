package condit.statements.com;

import java.util.Scanner;

public class PracticalTasks1 {
    /*
    Enter three numbers. Find out how many of them are odd
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int oneNumber = scanner.nextInt();
        int twoNumber = scanner.nextInt();
        int threeNumber = scanner.nextInt();

        System.out.println(oneNumber + ", " + twoNumber + ", " + threeNumber);

        int sum = 0;
        if(oneNumber % 2 == 1){
            sum++;
        } if (twoNumber % 2 == 1){
            sum++;
        } if (threeNumber % 2 == 1) {
            sum++;
            System.out.println("Numbers odd = " + sum);
        }



    }


}
