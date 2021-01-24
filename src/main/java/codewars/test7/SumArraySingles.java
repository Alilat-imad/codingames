package codewars.test7;

import java.util.ArrayList;
import java.util.Arrays;

// ** https://www.codewars.com/kata/59f11118a5e129e591000134
// In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. Your task will be to return the sum of the numbers that occur only once.
//
//For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.
//
//More examples in the test cases.
//
//Good luck!
//
//If you like this Kata, please try:
//
//Sum of prime-indexed elements
public class SumArraySingles {
    public static void main(String[] args) {
        System.out.println(SumArraySingles.repeats(4,5,7,5,4,8,9,9, 1));
    }
    public static int repeats(int... input) {
        int result = 0;
        ArrayList singleFields = new ArrayList();
        Arrays.sort(input);
        System.out.println("Output the sorted input : " + Arrays.toString(input));
        Arrays.sort(input);
        for(int i=0; i<input.length-1; i++)
        {
            if(input[i] != input[i+1]) result += input[i];
            else i++;

        }

        return result;
    }
}
