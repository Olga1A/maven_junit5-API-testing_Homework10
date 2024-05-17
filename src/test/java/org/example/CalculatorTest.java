package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test //Positive test
    public void subtractionOfTwoPositiveValues() {

        // Precondition: Creating instance of Calculator class
        Calculator myCalculator = new Calculator();

        // Add Two values method from the Calculator and provide values
        double actualValue = myCalculator.addTwoValues(8, 7);
        assertEquals(1, actualValue);
    }

    @Test //Nagative test
    public void subtractionOfTwoNegativeValues() {

        // Precondition: Creating instance of Calculator class
        Calculator myCalculator = new Calculator();

        // Add Two values method from the Calculator and provide values
        double actualValue = myCalculator.addTwoValues(-8, -7);
        assertEquals(-1, actualValue);
    }

    @Test //Greater test
    public void firstValueIsGreater() {
        assertTrue(8 > 7);
    }

    @Test
    public void firstValueIsEqual() {
        assertFalse(8 == 7);
    }

    @Test
    public void secondValueIsGreater() {
        assertFalse(8 < 7);
    }
}




