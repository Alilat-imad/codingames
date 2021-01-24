package codewars.test14;
// Power of Thor
// https://www.codingame.com/ide/puzzle/power-of-thor-episode-1
import java.util.Scanner;

public class PowerOfThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            for (int i = 0; i < remainingTurns; i++) {
                if ((initialTx > lightX) && (initialTy > lightY)) {
                    System.out.println("NW");
                    initialTx--;
                    initialTy--;
                } else if ((initialTx > lightX) && (initialTy == lightY)) {
                    System.out.println("W");
                    initialTx--;
                    //initialTy--;
                } else if ((initialTx > lightX) && (initialTy < lightY)) {
                    System.out.println("SW");
                    initialTx--;
                    initialTy++;
                } else if ((initialTx < lightX) && (initialTy > lightY)) {
                    System.out.println("NE");
                    initialTx++;
                    initialTy--;
                } else if ((initialTx < lightX) && (initialTy == lightY)) {
                    System.out.println("E");
                    initialTx++;
                    //initialTy--;
                } else if ((initialTx < lightX) && (initialTy < lightY)) {
                    System.out.println("SE");
                    initialTx++;
                    initialTy++;
                } else if ((initialTx == lightX) && (initialTy < lightY)) {
                    System.out.println("S");
                    //initialTx--;
                    initialTy++;
                } else if ((initialTx == lightX) && (initialTy > lightY)) {
                    System.out.println("N");
                    //initialTx--;
                    initialTy--;
                } else
                    break;

            }
            break;
        }
    }


}
