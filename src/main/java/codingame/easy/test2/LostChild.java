package codingame.easy.test2;

// https://www.codingame.com/ide/puzzle/the-lost-child-episode-1

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class LostChild {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int distanceCounter = 0;
        for (int i = 0; i < 10; i++) {
            String row = in.nextLine(); // ......M...
            sb.append(row);
        }

        int distance = Math.abs(sb.indexOf("M") - sb.indexOf("C"));
        System.out.println("The distance = " + (distance * 10) );


        /*
        Scanner in = new Scanner(System.in);
        String[][] map = new String[10][10];
        int distance = 0;
        int dimX = 5, dimY = 5;
        int rowMother = 0, colMother = 0;
        int rowChild = 0, colChild = 0;
        int rowWall = 0, colWall = 0;

        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                map[i][j] = in.nextLine();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        for (int y = 0; y < dimY; y++) {
            for (int x = 0; x < dimX; x++) {
                if (map[y][x].equalsIgnoreCase("M")) {
                    colMother = x;
                    rowMother = y;
                }
                if (map[y][x].equalsIgnoreCase("C")) {
                    colChild = x;
                    rowChild = y;
                }
                if (map[y][x].equalsIgnoreCase("#")) {
                    colWall = x;
                    rowWall = y;
                }
            }
        }

        int sum = 0;
        for (int currentRow = Math.min(rowChild, rowMother); currentRow < Math.max(rowChild, rowMother); currentRow++) {
            if (currentRow != rowChild && currentRow != rowMother) sum += 50;
            if (rowChild > rowMother) {
                sum += (colChild + (dimX - colMother));
            } else if (rowChild < rowMother) {
                sum += (colMother + (dimX - colChild));
            } else {
                // System.out.println("ColChild = " + colChild);
                // System.out.println("colMother = " + colMother);
                sum = Math.abs(colChild - colMother);
            }
        }

        // System.out.println("Child is at : [ " + rowChild + " ; " + colChild + " ]");
        // System.out.println("Mother is at : [ " + rowMother + " ; " + colMother + " ]");
        // System.out.println("Wall # is at : [ " + rowWall + " ; " + colWall + " ]");
        // System.out.println("The distance btw Child & Mother = " + sum);


        System.out.println((sum * 10) + "km");

        */
    }
}
