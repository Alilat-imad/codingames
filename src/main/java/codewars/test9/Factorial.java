package codewars.test9;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("** Factorial Program");
        System.out.print("Enter the nbr -> ");
        Scanner in =  new Scanner(System.in);
        int nb = in.nextInt();
        System.out.print("factorial( "+ nb +" ) = ");
        int result = Factorial.calculate(nb);
        System.out.print(result);
    }

    private static int calculate(int nb) {
        int result = 1;
        if(nb == 0 ) return result;
        for (int i = 1; i <= nb; i++) {
            result *= i;
        }
        return result;
    }

}
