package codewars.test5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumBytesABTest {

    @Test
    void sum() {
        assertEquals(3, SumBytesAB.sum((byte) 2, (byte) 1));
        assertEquals(9, SumBytesAB.sum((byte) 4, (byte) 5));
        assertEquals(5, SumBytesAB.sum((byte) 3, (byte) 2));
    }
}