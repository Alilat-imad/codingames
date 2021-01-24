package codewars.test17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsItNbrTest {


    @Test
    void isDigit() {
        assertFalse(IsItNbr.isDigit("s154"));
        assertTrue(IsItNbr.isDigit("-234.4"));
        assertTrue(IsItNbr.isDigit("  3  "));
        assertTrue(IsItNbr.isDigit("-3.23"));
        assertFalse(IsItNbr.isDigit("3-4"));
        assertFalse(IsItNbr.isDigit("  3   5"));
        assertFalse(IsItNbr.isDigit("3 5"));
        assertFalse(IsItNbr.isDigit("zero"));

    }
}