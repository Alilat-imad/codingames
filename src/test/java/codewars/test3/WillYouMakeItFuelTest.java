package codewars.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WillYouMakeItFuelTest {

    @Test
    public void testZeroFuelFunction()
    {
        assertTrue(WillYouMakeItFuel.zeroFuel(50,25,2));
        assertFalse(WillYouMakeItFuel.zeroFuel(100, 50, 1));
    }
}