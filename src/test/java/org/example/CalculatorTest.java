package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test //Positive test
    public void subtractionOfTwoPositiveValues() {

        // Precondition: Creating instance of Calculator class
        Calculator myCalculator = new Calculator();

        // Substract Two values method from the Calculator and provide values
        double actualValue = myCalculator.substractionOfTwoValues(8, 7);
        assertEquals(1, actualValue);
    }

    @Test //Nagative test
    public void subtractionOfTwoNegativeValues() {

        // Precondition: Creating instance of Calculator class
        Calculator myCalculator = new Calculator();

        // Add Two values method from the Calculator and provide values
        double actualValue = myCalculator.substractionOfTwoValues(-8, -7);
        assertEquals(-1, actualValue);
    }

    @Test //Greater test
    public void firstValueIsGreater() {
        Calculator myCalculator = new Calculator();
        assertTrue(myCalculator.isGreater(8, 7));
    }

    @Test//Equal test
    public void firstValueIsEqual() {
        Calculator myCalculator = new Calculator();
        assertFalse(myCalculator.isGreater(8, 8));
    }

    @Test
    public void secondValueIsGreater() {
        Calculator myCalculator = new Calculator();
        assertFalse(myCalculator.isGreater (7,8));
    }
}




