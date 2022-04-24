package PracticalExceptionLesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
try {
    int i = 4; int j = 0;
    System.out.println("Result: " + (i / j));
} catch (Exception e) {
    System.out.println("Division by zero");
}


//        int[] a = new int[];
//        a[2] = 0;
    }
}

