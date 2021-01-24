package codewars.test23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CountStringDuplicatesTest {

    @Test
    void duplicateCount_shouldReturnZero() {
        assertEquals(0, CountStringDuplicates.duplicateCount("imad"));
    }

    @Test
    void duplicateCount_shouldReturnTwo() {
        assertEquals(2, CountStringDuplicates.duplicateCount("aabbcde"));
    }


    @Test
    void duplicateCount_shouldReturnFour() {
        assertEquals(4, CountStringDuplicates.duplicateCount("aAbbcdeeff"));
    }

    @Test
    public void duplicateCount_shouldReturnTwo_() {
        assertEquals(13, CountStringDuplicates.duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }

}