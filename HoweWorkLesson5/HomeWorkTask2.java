package HoweWorkLesson5;

public class HomeWorkTask2 {

    public static void main(String[] args) {
        int[] numbers = {10, 9, -2, 6, -7, 1, 3, 4, -5, 8};



        int sum = 0;
        for (int a = 0; a < 5; a++) {
            if (numbers[a] > 0 ) {
                sum += numbers[a];
            }

            System.out.println("[" + a + "] " + numbers[a] + " +" + "= " + sum);
        }
        System.out.println("************");
        System.out.println("Sum = " + sum);
        System.out.println("================================");
        System.out.println();


        int product = 1;
        for (int i = 5; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                product = product * numbers[i];
            }
            System.out.println("[" + i + "] " + numbers[i] + " *" + "= " + product);
        }
        System.out.println("----------------------");
        System.out.println("Product = " + product);


    }


}
