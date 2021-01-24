package codewars.test22;

import org.junit.jupiter.api.*;

class SumMultipleOf3And5Test {

    @Test
    void solution() {

        // given
        int inputLimit = 10;

        // when
         int output = SumMultipleOf3And5.Solution(inputLimit);

        // then
        Assertions.assertEquals(23, output, "Should return 23");


    }

}