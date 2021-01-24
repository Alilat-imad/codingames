package codewars.test22;

public class SumMultipleOf3And5 {

    public static int Solution(int limit) {

        int sum = 0;
        for (int currentNbr = 0; currentNbr < limit; currentNbr++) {
            sum += (currentNbr % 3 == 0 || currentNbr % 5 == 0) ? currentNbr : 0;
        }

        return sum;
    }

}
