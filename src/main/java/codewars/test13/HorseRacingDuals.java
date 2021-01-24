package codewars.test13;

import java.util.*;

// https://www.codingame.com/ide/puzzle/horse-racing-duals
public class HorseRacingDuals {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the nbr of horse : ");
        int N = in.nextInt();
        List<Integer> HorsPower = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.print("Enter the power of the horse nb '" + (i+1) +"' : ");
            int pi = in.nextInt();
            HorsPower.add(pi);
        }
        System.out.println(HorsPower.toString());
        System.out.println("First, we order the list...");
        Collections.sort(HorsPower);

        int difference = 10000000;
        for (int i = 0; i < N-1; i++) {
            int tempoDiff = HorsPower.get(i + 1) - HorsPower.get(i);
            if(tempoDiff < difference) difference = tempoDiff;
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("answer => "+ difference);
    }

}
