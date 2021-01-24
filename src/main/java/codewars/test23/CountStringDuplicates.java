package codewars.test23;

// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/java

import java.util.*;

import org.apache.commons.lang3.*;

public class CountStringDuplicates {

    public static int duplicateCount(String inputText) {
        // Write your code here
        if (StringUtils.isEmpty(inputText)) return 0;
        int nbOfDuplicates = 1;
        int size = inputText.length();
        char[] arrayOfChars = inputText.toLowerCase().toCharArray();

        Map<Character, Integer> finalResult = new HashMap<>();

        for (int i = 0; i < size; i++) {
            nbOfDuplicates = 1;
            for (int j = i + 1; j < size; j++) {
                if (arrayOfChars[i] == arrayOfChars[j]) {
                    nbOfDuplicates++;
                    finalResult.put(arrayOfChars[i], nbOfDuplicates);
                }
            }
        }

        System.out.println(finalResult);

        return finalResult.size();
    }

}
