package codewars.test18;

// https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java

import org.apache.commons.lang3.ArrayUtils;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int[] fusion = ArrayUtils.addAll(arr1, arr2);
        int  sum = 0;
        for (int nb:
                fusion) {
            sum += nb;
        }
        return sum;
    }
}
