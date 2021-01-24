package codewars.test15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOddNumbersBelowNTest {

    @Test
    public void fixedTests(){
        assertEquals(7, CountOddNumbersBelowN.oddCount(15));
        assertEquals(7511, CountOddNumbersBelowN.oddCount(15023));
    }
}