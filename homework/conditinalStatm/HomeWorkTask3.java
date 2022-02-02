package homework.conditinalStatm;

import java.util.Scanner;

public class HomeWorkTask3 {

     /*
    read number of HTTP Error (400, 401,402, ...)
    and write the name of this error (Declare enum HTTPError)
     */

    public enum HTTPError{

        BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, METHOD_NOT_ALLOWED,
        NOT_ACCEPTABLE, PROXY_AUTHENTICATION_REQUIRED, REQUEST_TIMEOUT;


    }
    public static void main(String[] args) {

        HTTPError httpError;

        Scanner scanner = new Scanner(System.in);
        int numberError = scanner.nextInt();

        switch (numberError) {
            case 400:
                System.out.println(HTTPError.BAD_REQUEST);
                break;
            case 401:
                System.out.println(HTTPError.UNAUTHORIZED);
                break;

            case 402:
                System.out.println(HTTPError.PAYMENT_REQUIRED);
                break;
            case 403:
                System.out.println(HTTPError.FORBIDDEN);
                break;
            case 404:
                System.out.println(HTTPError.NOT_FOUND);
                break;
            case 405:
                System.out.println(HTTPError.METHOD_NOT_ALLOWED);
                break;
            case 406:
                System.out.println(HTTPError.NOT_ACCEPTABLE);
                break;
            case 407:
                System.out.println(HTTPError.PROXY_AUTHENTICATION_REQUIRED);
                break;
            case 408:
                System.out.println(HTTPError.REQUEST_TIMEOUT);
                break;
            default:
                System.out.println("Not this error");
                System.exit(0);

        }

    }
}
