package codewars.test15;

// https://www.codewars.com/kata/59342039eb450e39970000a6/train/java

public class CountOddNumbersBelowN {

    public static void main(String args[]) {
    }

    public static int oddCount(int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 != 0) count++;
        }
        return count;
    }
}
