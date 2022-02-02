package firstlesson.com;

import java.util.Scanner;

public class Task_One {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");

        // Create variable double for output radius
        double radius = scanner.nextDouble();

        //Calculate the area of a circle PI * radius * radius
        double area = Math.PI * (radius * radius);
        System.out.println("Area of a circle: " + area);

        //Calculate the perimeter of a circle PI * 2 * radius
        double perimeter = Math.PI * 2*radius;
        System.out.println("Perimeter of f circle: " + perimeter);





    }
}
