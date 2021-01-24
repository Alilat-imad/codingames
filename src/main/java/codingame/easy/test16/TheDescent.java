package codingame.easy.test16;

import java.util.*;

public class TheDescent {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int max = 0;
            int imax = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if(mountainH > max) {
                    max = mountainH;
                    imax = i;
                }
            }
            System.out.println(imax);
        }
    }

}

    // Height of mountain 0 : 0
    // Height of mountain 1 : 6
    // Height of mountain 2 : 7
    // Height of mountain 3 : 5
    // Height of mountain 4 : 0
    // Height of mountain 5 : 8
    // Height of mountain 6 : 1
// Height of mountain 7 : 0
