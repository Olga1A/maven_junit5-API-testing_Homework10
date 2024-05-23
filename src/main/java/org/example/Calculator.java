package org.example;

public class Calculator {

    //Implementation of adding two values method
    public double substractionOfTwoValues(double firstInputValue, double secorndInputValue) {
        double result = firstInputValue - secorndInputValue;
        return result;
    }

    //Implementation of greater method
    public boolean isGreater(double firstInputValue, double secondInputValue) {
        return firstInputValue > secondInputValue;

    }

    //Implementation of floating division method
    public float devicionOfTwoValues(float firstInputValue, float secorndInputValue) {
        float result = firstInputValue / secorndInputValue;
        return result;
    }

    //Implementation of floating multiplying method
    public float multiplicationOfTwoValues(float firstInputValue, float secorndInputValue) {
        float result = firstInputValue * secorndInputValue;
        return result;

    }
    //Implementation of squaring a number method
    public double squaringOfOneValue(double firstInputValue) {
        double result = Math.sqrt(firstInputValue);
        return result;

    }
}