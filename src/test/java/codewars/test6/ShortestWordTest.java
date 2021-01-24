package codewars.test6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordTest {

    @Test
    void getShortedStringWordLength() {
        assertEquals(4, ShortestWord.getShortedStringWordLength("Bonjour Imad ALILAT"));
    }
}