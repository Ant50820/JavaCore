package firstLesson.com;

import java.util.Scanner;

public class Draft {

    public static void helloLoops() {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        while(value< 10)

    {
        System.out.println("salute - " + value);

        value = value + 1;

    }
}
}
