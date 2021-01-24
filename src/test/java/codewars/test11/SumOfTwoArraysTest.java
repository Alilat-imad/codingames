package codewars.test11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoArraysTest {

    @Test
    void arrayPlusArray() {
        assertEquals(21, SumOfTwoArrays.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, SumOfTwoArrays.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, SumOfTwoArrays.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, SumOfTwoArrays.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));    }
}