package condit.statements.com;

import java.util.Scanner;

public class HomeWorkTask1 {

    /*
    read 3 float numbers and check: are they all belong to the range [-5,5];
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float oneNumber = scanner.nextFloat();
        float twoNumber = scanner.nextFloat();
        float threeNumber = scanner.nextFloat();

        boolean range1 = oneNumber < 5 && oneNumber > -5;
        boolean range2 = twoNumber < 5 && twoNumber > -5;
        boolean range3 = threeNumber < 5 && threeNumber > -5;

        if (range1 && range2 && range3) {
            System.out.println("good job!");
        } else {
            System.out.println("They aren't belong to the range!");
        }

    }
}
