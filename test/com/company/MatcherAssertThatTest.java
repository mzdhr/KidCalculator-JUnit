package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MatcherAssertThatTest {

    // Fields
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator("Red");
    }


    @Test
    public void assert_old_way(){
        // Action
        int result = calculator.addition(10, 4);
        // Assert
        assertEquals(result, 14);
    }

    @Test
    public void assert_that_test() {
        // Action
        int result = calculator.addition(10, 4);
        // Assert
        assertThat(result, is(14));
    }

    @Test
    public void assert_with_message_test(){
        // Action
        int result = calculator.addition(10, 10);
        // Assert
        assertThat("This is a message, shows when test failed!", result, is(20));
    }

    @Test
    public void assert_is_type_x_class_test(){
        // Action
        int result = calculator.addition(10, 5);
        // Assert
        assertThat(result, isA(Integer.class));
    }

    @Test
    public void assert_not_type_x_class_test(){
        // Action
        int result = calculator.addition(10, 4);
        // Assert
        assertThat(result, is(not(instanceOf(Double.class))));
    }

    @Test
    public void assert_not_null_test(){
        // Action
        String color = calculator.getColor();
        // Assert
        assertThat(color, is(notNullValue()));
    }

    @Test
    public void assert_contains_string_test(){
        // Action
        String color = calculator.getColor();
        // Assert
        assertThat(color, containsString("e"));
    }

    @Test
    public void assert_contains_any_with_test(){
        // Action
        String color = calculator.getColor();
        // Assert
        assertThat(color, anyOf(containsString("S"), containsString("B"), containsString("d")));
    }

    @Test
    public void assert_start_with_test(){
        // Action
        String color = calculator.getColor();
        // Assert
        assertThat(color, startsWith("R")); // there is also -> endsWith()
    }

    @Test
    public void assert_true_test(){
        // Action
        calculator.setOn();
        boolean power = calculator.getPower();
        // Assert
        assertThat(power, is(true));
    }

    @Test
    public void assert_list_test(){
        // Action
        int number01 = calculator.addition(1, 1);
        int number02 = calculator.addition(1, 2);
        int number03 = calculator.addition(1, 3);
        int number04 = calculator.addition(1, 4);

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(number01);
        myList.add(number02);
        myList.add(number03);
        myList.add(number04);

        int itemWanted = 5;

        // Assert
        assertThat(myList, hasItem(itemWanted));
    }

}
