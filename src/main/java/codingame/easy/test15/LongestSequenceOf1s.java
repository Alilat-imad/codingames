package codingame.easy.test15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.codingame.com/ide/puzzle/create-the-longest-sequence-of-1s
public class LongestSequenceOf1s {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a bit sequence : ");
        String b = in.nextLine();
        if(b.length() == 1) System.out.println(1);
        if(b.length() == 2) System.out.println(1);

        char[] arrayOfByts = b.toCharArray();

        List<List<Character>> output = new ArrayList<>();

        for (char c:
             arrayOfByts) {
            if(c == '0') {
                List<Character> subList = new ArrayList<>();
                subList.add(c);
            }
        }
    }

}
