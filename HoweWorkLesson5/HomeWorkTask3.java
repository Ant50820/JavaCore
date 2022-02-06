package HoweWorkLesson5;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTask3 {

    /*
    Enter 5 integer numbers. Find
       * position of second positive number;
       * minimum and its position in the array.

     */
    public static void main(String[] args) {

        //* position of second positive number;
        int[] numbers = {5, -9, 1, -2, 7};
                int tmp;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j =  i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("***********************");
        System.out.println(" Second positive position = " + numbers[1]);



        //*  minimum and its position in the array;
        Arrays.sort(numbers);
        System.out.println(" Second negative position = " + numbers[1]);




        /*
        Organize entering integers until the first negative number.
        Count the product of all entered even numbers.
         */
                Scanner scanner = new Scanner(System.in);
        int sum = 1;
        int n;
        int sc = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0){
                break;
            }
            sum *=n;
        }
        System.out.println(sum);
        scanner.close();










//
//        Arrays.sort(numbers);
//
//        int index = Arrays.binarySearch(numbers, 5);
//        String elem = Arrays.toString(numbers);
//
//        System.out.println("Num sort = " + elem);
//        System.out.println("Position of element with value 5 is " + index);
//
//        Arrays.parallelSort(numbers);
//        System.out.println("--------------");
//        System.out.println(elem);

    }
}
