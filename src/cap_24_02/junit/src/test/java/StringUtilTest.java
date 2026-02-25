package cap_24_02.junit.src.src.test.java;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.*;
import org.example.StringUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringUtilTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up before test...");
        StringUtil util = new StringUtil();
    }

    @AfterEach // This method will run after each test method
    void testCountVowels() {
        StringUtil util = new StringUtil();
        String testString = "Real Madrid is the best football club in the world";
        int expectedVowelCount = 16;
        Assertions.assertEquals(expectedVowelCount, util.countVowels(testString));
    }

    @Test
    void testCountWords() {
        StringUtil util = new StringUtil();
        String testString = "Real Madrid is the best football club in the world";
        int expectedWordCount = 10;
        Assertions.assertEquals(expectedWordCount, util.countWords(testString));

    }

    @ParameterizedTest
    @MethodSource("methodSourceTest")
    void CountGreaterThan10Test() {
        StringUtil util = new StringUtil();
        String testString = "Real Madrid is the best football club in the world";
        Assertions.assertTrue(util.GreaterThanLength(testString, 10));
    }

    public static Stream<Arguments> methodSourceTest() {
        return Stream.of(
                Arguments.of("Real Madrid is the best football club in the world", 10, true),
                Arguments.of("Pass to Ronaldo - Zizou", 5, true),
                Arguments.of("15 UCLs, 36 La Liga titles, 20 Copa del Rey, 13 Supercopa de España, a Copa Eva Duarte and a Copa de la Liga", 20, false)
        );
    }

     @ParameterizedTest
     @MethodSource("methodSourceTest")
     void testGreaterThanLength(String input, int length, boolean expected) {
         StringUtil util = new StringUtil();
         Assertions.assertEquals(expected, util.GreaterThanLength(input, length));
     }
}
