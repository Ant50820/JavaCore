package PACKAGE_NAME;public class Task_Three {
  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Enter Call cost per minute
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();
        System.out.println("Call cost for First Countries: " + c1 + " $ for min");
        System.out.println("Call cost for Second Countries: " + c2 + " $ for min");
        System.out.println("Call cost for Third Countries: " + c3 + " $ for min");

        //Enter talks continued minutes
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        System.out.println("Talks continued minutes First Countries: " + t1 + " min");
        System.out.println("Talks continued minutes Second Countries: " + t2 + " min");
        System.out.println("Talks continued minutes Third Countries: " + t3 + " min");
        System.out.println(" ");

        // The cost of each call separately
        int firstCall = c1 * t1;
        int secondCall = c2 * t2;
        int thirdCall = c3 * t3;
        System.out.println("The cost of each call First Countries: " + firstCall + " $");
        System.out.println("The cost of each call Second Countries: " + secondCall + " $");
        System.out.println("The cost of each call Third Countries: " + thirdCall + " $");
        System.out.println("------------------------------------------------------ ");

        int sumAllCalls = firstCall + secondCall + thirdCall;
        System.out.println("Talk together: " + sumAllCalls + " $");

    }
}
