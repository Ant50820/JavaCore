package condit.statements.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Operators {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input = br.readLine();

        int a = 0;
        switch (input.toLowerCase()) {
            case "yes":
            case "maybe":
                System.out.println("Great!");
                a += 5;
                break;
            case "no":
                a -=4;
                System.out.println("Too bad!");
                break;
            default:
                System.out.println("Wrong!");
                break;
        }
        System.out.println(a);
    }
}

//        int t = new Random().nextInt(10);
//
//        System.out.println(t);
//
//        //int a = t > 5 ? doSath(t) : doSath1(t);
//
//        String a;
//        if (t < 5) {
//            a = "yes";
//        }
//        else if (t > 7) {
//            a = "no" + t + "no enough";
//        }
//        System.out.println(a);
//
//
//    }
//
//    public static int doSath(int t) {
//        return t-10;
//    }
//
//    public static int doSath1(int t) {
//        return t+10;
//    }


