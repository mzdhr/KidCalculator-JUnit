package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathematicalDivisionTest {

    // Fields
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator("Purple");
    }

    @Test
    public void division_a_test(){
        // Action
        int result = calculator.division(12, 6);
        // Assert
        assertEquals(result, 2);    // is result actually equal 2?
    }

    @Test
    public void division_c_test(){
        // Action
        int result = calculator.division(10, -2);
        // Assert
        assertEquals(result, -5);    // is result actually equal -5?
    }
}
