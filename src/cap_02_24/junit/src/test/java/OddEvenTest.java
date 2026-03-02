package cap_24_02.junit.src.src.test.java;

import org.example.OddEven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddEvenTest {

        @BeforeEach
        void setUp() {
            // No setup needed for this test class
        }

    @Test
    public void testOddEven() {
        OddEven oddEven = new OddEven();
        assertEquals(1, oddEven.oddEven(4)); // Testing even number
        assertEquals(0, oddEven.oddEven(7)); // Testing odd number
    }

    @Test
    public  void testOddEven2() {
        OddEven oddEven = new OddEven();
        assertEquals(1, oddEven.oddEven(10)); // Testing even number
        assertEquals(0, oddEven.oddEven(15)); // Testing odd number
    }
}
