package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class MathematicalAdditionTest {

    // Fields
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator("Orange");
    }

    @Test
    public void addition_a_test(){
        // Action
        int result = calculator.addition(6, 6);
        // Assert
        assertEquals(result, 12);    // is result actually equal 12?
    }

    @Test
    public void addition_b_test(){
        // Action
        int result = calculator.addition(-1, 8);
        // Assert
        assertEquals(result, 7);    // is result actually equal 7?
    }

    @Test
    @Category({CategorySlowTest.class})     // Marking this Test as CategorySlowTest, you can add more Categories too.
    public void addition_c_test(){
        // Action
        int result = calculator.addition(-1, -1);
        // Assert
        assertEquals(result, -2);    // is result actually equal -2?
    }
}
