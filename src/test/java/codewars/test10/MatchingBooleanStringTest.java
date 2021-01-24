package codewars.test10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchingBooleanStringTest {

    @Test
    void testBoolToWord(){
        assertEquals("YES", MatchingBooleanString.boolToWord(true));
        assertEquals("NO", MatchingBooleanString.boolToWord(false));
    }

}