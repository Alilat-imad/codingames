package codewars.test21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CubeTest {


    @Test
    void getSide() {

        Cube cube = new Cube();

        assertEquals(0, cube.getSide(), "Should return 0");
        cube.setSide(5);
        assertEquals(5, cube.getSide(), "Should return 5");
    }

}