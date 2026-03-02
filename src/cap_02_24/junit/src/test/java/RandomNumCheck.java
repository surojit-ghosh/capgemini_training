package cap_24_02.junit.src.src.test.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.example.RandomNumberGenerator;

public class RandomNumCheck {

    @BeforeEach
    public void setUp() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
    }

    @Test
    public void testRandomNumber() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        assertTrue(generator.generateRandomNumber(1, 100) >= 1 && generator.generateRandomNumber(1, 100) <= 100);
    }

    @RepeatedTest(10)
    public void testRandomNumberRepeated() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int randomNum = generator.generateRandomNumber(1, 100);
        assertTrue(randomNum >= 1);

    }
}
