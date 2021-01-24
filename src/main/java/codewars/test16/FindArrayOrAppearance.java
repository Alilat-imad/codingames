package codewars.test16;

// https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindArrayOrAppearance {

    public static int findIt(int... list){
        int recc, index;
        for(int i = 0; i < list.length; i++)
        {
            recc = 0; index = 0;
            for (int j = 0 ; j < list.length; j++) {
                if(list[i] == list[j]) {
                 index = i; // 0
                    recc++; // 1
                }
            }

            if(isOddNb(recc)) {
                System.out.println("FOUND !");
                return list[index];
            }
        }
        return 0;
    }


    public static boolean isOddNb(int nb){
        if(nb == 0) return false;
        return (nb % 2 != 0);
    }
}
