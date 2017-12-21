package com.company;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    // Fields
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator("Red");
    }

    @Test
    public void addition_test() {
        // Action
        int result = calculator.addition(2, 2);
        // Assert
        assertEquals(result, 4);    // is result actually equal 4?
    }

    @Test
    public void subtraction_test() {
        // Action
        int result = calculator.subtraction(10, 4);
        // Assert
        assertEquals(result, 6);
    }

    @Test
    public void multiplication_test() {
        // Action
        int result = calculator.multiplication(5, 5);
        // Assert
        assertEquals(result, 25);
    }

    @Test
    public void division_test() {
        // Action
        int result = calculator.division(10, 2);
        // Assert
        assertEquals(result, 5);
    }

    @Test
    public void check_color_and_change_it_test(){
        // Action
        if (calculator.getColor().equals("Red")){
            calculator.setColor("Blue");
        }
        // Assert
        // Check is color changed?
        assertEquals(calculator.getColor(), "Blue");
    }

    @Ignore
    @Test
    public void check_color_is_still_changed(){
        // Assert
        assertEquals(calculator.getColor(), "Blue");
    }


    // --------------------------- //
    // --- New Tests - Part 02 --- //
    // --------------------------- //

    @Test
    public void setting_calculator_color_test(){
        // Action
        calculator.setColor("blue");

        // Assert
        assertEquals(calculator.getColor(), "blue"); // is calculator color actually blue?
    }

    @Ignore
    @Test
    public void subtraction_multiplication_tests(){
        // Action & Assert
        assertEquals(calculator.subtraction(10, 6), 4);     // is 10 - 6 = 4 ?
        assertEquals(calculator.multiplication(6, 2), 12);  // is 6 * 2 is 12 ?
    }

    @Test
    public void divisions_test(){
        // Action & Assert
        assertEquals("Normal Division", calculator.division(100, 2), 50);
        assertEquals("Long Division", calculator.longDivision(100, 2), 50);
    }

    @Test
    public void calculator_is_not_null_test(){
        // Assert
        assertNotNull(calculator);
    }

    @Test
    public void check_calculator_power_test(){
        // Assert & Action
        assertTrue(calculator.checkPower());    // is calculator is powered on?
    }


}