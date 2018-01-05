package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathematicalSubtractionTest {

    // Fields
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator("Yellow");
    }

    @Test
    public void subtraction_a_test(){
        // Action
        int result = calculator.subtraction(6, 7);
        // Assert
        assertEquals(result, -1);    // is result actually equal -1?
    }

    @Test
    public void subtraction_b_test(){
        // Action
        int result = calculator.subtraction(-1, -5);
        // Assert
        assertEquals(result, 4);    // (-1) - (-5) = 4?
    }

    @Test
    public void subtraction_c_test(){
        // Action
        int result = calculator.subtraction(10, 4);
        // Assert
        assertEquals(result, 6);    // is result actually equal 6?
    }

}
