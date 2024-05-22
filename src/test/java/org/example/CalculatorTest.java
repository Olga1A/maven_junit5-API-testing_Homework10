package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    //Declaration
    Calculator myCalculatorInst;

    @BeforeEach
    public void setUp(){

        //Creation
        myCalculatorInst = new Calculator();
    }

    @Test //Positive test
    public void subtractionOfTwoPositiveValues() {

        // Precondition: Creating instance of Calculator class
        Calculator myCalculatorInst = new Calculator();

        // Substract Two values method from the Calculator and provide values
        double actualValue = myCalculatorInst.substractionOfTwoValues(8, 7);
        assertEquals(1, actualValue);
    }

    @Test //Nagative test
    public void subtractionOfTwoNegativeValues() {

        // Precondition: Creating instance of Calculator class
        Calculator myCalculatorInst = new Calculator();

        // Add Two values method from the Calculator and provide values
        double actualValue = myCalculatorInst.substractionOfTwoValues(-8, -7);
        assertEquals(-1, actualValue);
    }

    @Test //Greater test
    public void firstValueIsGreater() {
        Calculator myCalculatorInst = new Calculator();
        assertTrue(myCalculatorInst.isGreater(8, 7));
    }

    @Test//Equal test
    public void firstValueIsEqual() {
        Calculator myCalculatorInst = new Calculator();
        assertFalse(myCalculatorInst.isGreater(8, 8));
    }

    @Test
    public void secondValueIsGreater() {
        Calculator myCalculatorInst = new Calculator();
        assertFalse(myCalculatorInst.isGreater(7,8));

    }
    @Test //Positive test
    public void devicionOfTwoPositiveValues() {

        // Precondition: Creating instance of Calculator class
        Calculator myCalculatorInst = new Calculator();

        // Division Two values method from the Calculator and provide values
        float actualValue = myCalculatorInst.devicionOfTwoValues(8.1f,7.1f);
        assertEquals(1.1408452f, actualValue);

    }
    @Test //Positive test
    public void multiplicationOfTwoPositiveValues() {

        // Precondition: Creating instance of Calculator class
        Calculator myCalculatorInst = new Calculator();

        // Multiplication Two values method from the Calculator and provide values
        float actualValue = myCalculatorInst.multiplicationOfTwoValues(8.1f,7.1f);
        assertEquals(57.510002f, actualValue);

    }
    @Test
    public void squaringOfOneValue() {
        Calculator myCalculatorInst = new Calculator();
        double valueInput = Math.sqrt(5);
    }
}




