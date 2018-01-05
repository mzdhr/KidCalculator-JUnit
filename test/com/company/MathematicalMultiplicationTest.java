package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(CategorySlowTest.class)
public class MathematicalMultiplicationTest {

    // Fields
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator("Brown");
    }

    @Test
    public void multiplication_a_test(){
        // Action
        int result = calculator.multiplication(6, 6);
        // Assert
        assertEquals(result, 36);    // is result actually equal 36?
    }

    @Test
    public void multiplication_b_test(){
        // Action
        int result = calculator.multiplication(-1, 5);
        // Assert
        assertEquals(result, -5);    // is result actually equal -5?
    }

    @Test
    public void multiplication_c_test(){
        // Action
        int result = calculator.multiplication(-4, -4);
        // Assert
        assertEquals(result, 16);    // is result actually equal 16?
    }
}
