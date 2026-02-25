package cap_24_02.junit.src.src.test.java;// syntax explanation:
/*
- `import org.example.Calculator;`: This line imports the `Calculator` class from the `org.example` package, allowing us to use it in our test class.
- `import org.junit.jupiter.api.Test;`: This line imports the `Test` annotation from the JUnit 5 library, which is used to mark methods as test cases.
- `import static org.junit.jupiter.api.Assertions.assertEquals;`: This line imports the `assertEquals` method from the JUnit 5 library, allowing us to use it for assertions in our test cases without needing to prefix it with the class name.
- `public class CalculatorTest { ...
*/
import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach // BeforeEach is an annotation from the JUnit testing framework that indicates that the annotated method should be executed before each test method in the test class. This is typically used to set up any necessary test data or state before each test is run.
    void setUp() {
        calculator = new Calculator();
    }

    // By default framework will create a new instance of the test class for each test method, so we can use a static variable to share the same instance of the Calculator across all test methods.
    // This way, we can avoid creating a new instance of the Calculator for each test method and instead reuse the same instance.

    // syntax explanation:
    /*- `private static Calculator cal = new Calculator();`: This line declares a private static variable named `cal` of type `Calculator` and initializes it with a new instance of the `Calculator` class
    - `@Test`: This annotation indicates that the method `testAdd()` is a test case that should be executed by the JUnit testing framework.
    - `public void testAdd() { ... }`: This is the definition of the test method named `testAdd`. It is a public method that does not return any value (void).
    - `assertEquals(8, cal.add(5, 3));`: This line uses the `assertEquals` method to check if the result of `cal.add(5, 3)` is equal to `8`. If the assertion fails, the test will fail and report the discrepancy.
     */

    private static Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        // assertEquals(expected, actual) is a method from the JUnit testing framework that checks if the expected value matches the actual value. If they do not match, the test will fail and report the discrepancy.
        assertEquals(8, cal.add(5, 3));
    }

//    @Test
//    public void subTest()
//    {
//        Calculator cal = new Calculator();
//        // testing a wrong value to see the test fail
//        assertEquals(1, cal.subtract(5, 3));
//    }

    @ParameterizedTest
    @CsvSource({
            // "value1, value2, expectedValue" is the format for each test case in the CsvSource annotation.
            // Each line represents a separate test case with the specified values.
            "5,5,20",   // wrong expected value to see the test fail
            "10,10,100", // correct expected values to see the test pass
            "2,3,6",
            "4,5,20"
    })

        // @CsvFileSource(resources = "/multiplyTestData.csv") is an annotation that indicates that the test data
        // for the parameterized test should be read from a CSV file located at the specified path.
        // The CSV file should contain the test data in a format that matches the parameters of the test method.

    void multiplyTest(int a, int b, int expected) {
        assertEquals(expected, cal.multiply(a, b));
    }
}
