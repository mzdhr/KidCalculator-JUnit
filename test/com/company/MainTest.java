package com.company;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator("Red");
    }

    @Test
    public void addition_test() {
        int result = calculator.addition(2, 2);
        assertEquals(result, 4);
    }

    @Test
    public void subtraction_test() {
        int result = calculator.subtraction(10, 4);
        assertEquals(result, 6);
    }

    @Test
    public void multiplication_test() {
        int result = calculator.multiplication(5, 5);
        assertEquals(result, 25);
    }

    @Test
    public void division_test() {
        int result = calculator.division(10, 2);
        assertEquals(result, 5);
    }

    @Test
    public void check_color_and_change_it_test(){
        if (calculator.getColor().equals("Red")){
            calculator.setColor("Blue");
        }

        // Check is color changed?
        assertEquals(calculator.getColor(), "Blue");
    }

    @Test
    public void check_color_is_still_changed(){
        assertEquals(calculator.getColor(), "Blue");
    }

}