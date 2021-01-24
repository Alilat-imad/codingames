package codewars.test7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArraySinglesTest {

    @Test
    void testRepeatsOutput() {
        int output = 0;

        output = SumArraySingles.repeats(0);
        assertEquals(0, output);

        output = SumArraySingles.repeats(4,5,7,5,4,8);
        assertEquals(15, output);


    }
}