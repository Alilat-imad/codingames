package codewars.test19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BmiTest {

    @Test
    void bmi() {
        assertEquals("Normal", Bmi.calculate(80, 1.80));

    }
}