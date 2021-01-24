package codewars.test8;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("** Fibonacci Program");
        System.out.println("Enter the sequence limit...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Limit -> ");
        int limit = scanner.nextInt();
        Fibonacci.FibonacciSequence(limit);
    }

    private static void FibonacciSequence(int limit) {
        System.out.print(1 + ", " + 1 +  ", ");
        int nb1 = 1;
        int nb2 = 1;
        int result = 0;
        for (int i = 2; i < limit; i++) {
            result = nb1 + nb2;
            nb1 = nb2;
            nb2 = result;
            System.out.print(result + ", ");

        }
    }


}
