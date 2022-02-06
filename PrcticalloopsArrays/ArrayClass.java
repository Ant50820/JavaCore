package PrcticalloopsArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

    /*
    Create an array of ten integers. Display
        * the biggest of these numbers;
        * the sum of positive numbers in the array;
        * the amount of negative numbers in the array.
       What values there are more: negative or positive?

     */
    public static void main(String[] args) {


        int[] numbers = {2, 6, -9, 8, 1, -1, 5, 7, -7, 10};


        // Display the biggest of these numbers;
        int max = numbers[0];
        int imax = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] > max) {
                max = numbers[i];
                imax = i;
                System.out.println(imax + " - " + i + " Array - " + numbers[i]);
            }
            i++;
        }
       System.out.println("Maximun = " + max);
       System.out.println(" is in " + (imax + 1) + " place");
        System.out.println("=============================");
        System.out.println();


       //the sum of positive numbers in the array;
       int sum = 0;
        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] > 0) {
                sum += numbers[a];
            }

            System.out.println("[" + i + "] " + numbers[a] + " +" + "= " + sum);
        }
        System.out.println("************");
        System.out.println("Sum = " + sum);
        System.out.println("================================");
        System.out.println();



        //the amount of negative numbers in the array.
        int amount = 0;
        for (int x : numbers) {
            if (x < 0 && x <= 0) {
                amount++;
            }
            System.out.println( x + ") " + " +" + "= " + amount);
        }
        System.out.println("******************");
        System.out.println("Amount negative = " + amount);
        System.out.println("____________________");


        //the amount of positive in the array
        int amountPositive = 0;
        for (int y : numbers) {
            if (y > 0) {
                amountPositive++;
            }
            System.out.println( y + ") " + " +" + "= " + amountPositive);
        }
        System.out.println("******************");
        System.out.println("Amount positive = " + amountPositive);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
        //What values there are more: negative or positive?
        if (amount > amountPositive) {
            System.out.println("Negative elements = " + amount);
        } else {
            System.out.println("Positive elements = " + amountPositive);
        }












//        int[] arr = {2, -7, 5, -4, 8};
//
//        Arrays.sort(arr);
//        int index = Arrays.binarySearch(arr, 8);
//        String elem = Arrays.toString(arr);
//
//        System.out.println("Num =- " + elem);
//        System.out.println("Position of element with value 8 is " + index);
//
//        Arrays.parallelSort(arr);
//        System.out.println("--------------");
//        System.out.println(elem);



//        int[] arr = {2, -7, 5, -4, 8};
//        int tmp;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j =  i + 1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//





//        int[] arr = {2, -7, 5, -4, 8};
//        int max = arr[0];
//        int imax = 0;
//        int i = 0;
//        while (i < arr.length) {
//            if (arr[i] > max) {
//                max = arr[i];
//                imax = i;
//                System.out.println(imax + " - " + i + " Array - " + arr[i]);
//            }
//            i++;
//
//            System.out.println("--------------");
//        }
//        System.out.println("Maximun = " + max);
//        System.out.println(" is in " + (imax + 1) + " place");



//        int[] arr = {2, -7, 5, -4, 8};
//        int amount = 0;
//        for (int a : arr) {
//            if (a > 0 && a <=7) {
//                amount++;
//            }
//            System.out.println( a + ") " + " +" + "= " + amount);
//        }
//        System.out.println("////////////////////");
//        System.out.println("Amount = " + amount);
//


//        int[] arr = {2, -7, 5, -4, 8};
//        int product = 1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                product = product * arr[i];
//            }
//            System.out.println("[" + i + "] " + arr[i] + " *" + "= " + product);
//        }
//        System.out.println("----------------------");
//        System.out.println("Product = " + product);



//        int[] arr = {2, -7, 5, -4, 8};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            System.out.println("[" + i + "] " + arr[i] + " +" + "= " + sum);
//        }
//        System.out.println("************");
//        System.out.println("Sum = " + sum);


//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int n;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Input number");
//            n = Integer.parseInt(scanner.nextLine());
//            if (n < 0){
//                continue;
//            }
//            sum += n;
//        }
//        System.out.println(sum);
//        scanner.close();





//        String[] carsMod = {"Ford", "Opel", "Toyota", "BMV"};
//        for (String h : carsMod) {
//            System.out.println(h);
//        }

//        int[] numbers = {5, 4, 9,4,8};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println( i + ")" + numbers[i]);
//
//        }


//        for (int i = 0; i < args.length; i++) {
//            String arg = args[i];
//            System.out.println(arg);
//            System.out.println(i);
//
//        }
//
//        int i = 0;
//
//        do {
//            System.out.println(i + " + " + " 1 " +  " = " + ++i);
//        }
//        while (i < 5);




//
//        int num = 0;
//        while (num <= 5) {
//            System.out.println(num + ") " + num);
//            num++;
//        }





//        String dayWeek[] = new String[7];
//
//        String[] month;
//        month = new String[12];
//
//        dayWeek[0] = "Monday";
//        month[11] = "December";
//
//        String[] days = {"Mon", "Tus", "Wen", "Thus"};
//        System.out.println(Arrays.toString(days));
//        System.out.println(Arrays.toString(dayWeek));
//        System.out.println(Arrays.toString(month));
//
//        int[] monthDays = {31, 10, 15};


    }
}
