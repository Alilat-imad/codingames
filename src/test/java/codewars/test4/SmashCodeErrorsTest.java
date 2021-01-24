package codewars.test4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmashCodeErrorsTest {

    @Test
    public void basicTests() {
        // assertEquals("expected", "actual");
        assertEquals(7, SmashCodeErrors.findLongest("The quick white fox jumped around the massive dog"));
        assertEquals(10, SmashCodeErrors.findLongest("Take me to tinseltown with you"));
        assertEquals(7, SmashCodeErrors.findLongest("Sausage chops"));
        assertEquals(6, SmashCodeErrors.findLongest("Wind your body and wiggle your belly"));
        assertEquals(7, SmashCodeErrors.findLongest("Lets all go on holiday"));
    }
}