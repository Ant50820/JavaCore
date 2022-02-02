package conditinalStatm.com;

import java.util.Scanner;

public class HomeWorkTask2 {

     /*
    read 3 integer numbers and write max and min of them;
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int number1, number2, number3, max, min;
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();

        max = getNumberMax(number1, number2, number3);
        min = getNumderMin(number1, number2, number3);


        System.out.println("Input number max = " + max);

        System.out.println("Input number max = " + min);

    }

    // Method Math.max
    public static int getNumberMax(int number1, int number2, int number3) {
        return number3 > (number1 > number2 ? number1 : number2)?
                number3 : ((number1 > number2)? number1 : number2);
    }

    // Method Math.min
    public static int getNumderMin(int number1, int number2, int number3) {
        return number3 < (number1 < number2 ? number1 : number2)?
                number3 : ((number1 < number2)? number1 : number2);
    }


}
