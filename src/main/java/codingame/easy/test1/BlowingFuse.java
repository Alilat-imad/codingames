package codingame.easy.test1;

// https://www.codingame.com/ide/puzzle/blowing-fuse

import java.util.Scanner;

public class BlowingFuse {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int capacity = in.nextInt();
        int maxPower = 0;
        int[] consumptions = new int[n];
        boolean isBlown = false;
        for (int i = 0; i < n; i++) {
            consumptions[i] = in.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            int mx = in.nextInt();
            maxPower += consumptions[mx-1];
            if (capacity <= maxPower) {
                isBlown = true;
                break;
            }
        }

        if (capacity <= maxPower) isBlown = true;

        if (isBlown) System.out.println("Fuse was blown.");
        else {
            System.out.println("Fuse was not blown.");
            System.out.println("Maximal consumed current was " + maxPower + " A.");
        }
    }

}


/*

Nb of machines 5
Nb of click 8
capacity 82

18  ---- 1
20  ---- 2
3   ---- 3
1   ---- 4
20  ---- 5

Machine to Click #ID = 2         ----- iteration 1
consumptions[mx-1] = 20
maxPower = 20
Machine to Click #ID = 4        ----- iteration 2
consumptions[mx-1] = 1
maxPower = 21
Machine to Click #ID = 3        ----- iteration 3
consumptions[mx-1] = 3
maxPower = 24
Machine to Click #ID = 3        ----- iteration 4
consumptions[mx-1] = 3
maxPower = 27
Machine to Click #ID = 5        ----- iteration 5
consumptions[mx-1] = 20
maxPower = 47
Machine to Click #ID = 4        ----- iteration 6
consumptions[mx-1] = 1
maxPower = 48
Machine to Click #ID = 2        ----- iteration 7
consumptions[mx-1] = 20
maxPower = 68
Machine to Click #ID = 3        ----- iteration 8
consumptions[mx-1] = 3
maxPower = 71

Fuse was not blown.
Maximal consumed current was 71 A.*** 41 A
*/