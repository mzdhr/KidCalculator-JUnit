package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

// This class become a Parameterized Runner.
@RunWith(Parameterized.class)
public class ParameterizedTest {

    // Fields
    private Calculator mCalculator;
    private int mInput01;   // uses to store input for the first number.
    private int mInput02;   // uses to store input for the second number.
    private int mExpect;    // uses to store input for the expect test result.

    @Before
    public void setUp(){
        // Arrange
        mCalculator = new Calculator("Orange");
    }

    // Class Constructor -> To hook the values to our @Test Method.
    // It will run for each parameter we have in our Data.
    public ParameterizedTest(int input01, int input02, int expected){
        mInput01 = input01;
        mInput02 = input02;
        mExpect = expected;
    }

    // This notation provide the input parameters for our @Test Method via the Constructor.
    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {2, 4, 6},          // means: 2 + 4 = 6
                {4, 4, 8},          // means: 4 + 4 = 8
                {-11, 4, -7},       // means: -11 + 4 = -7
                {66, 395, 461},     // means: 66 + 395 = 461
                {1000, -4, 996},    // means: 1000 + 4 = 996
                {99, 1, 100}        // means: 99 + 1 = 100
        });
    }

    // Our @Test Method
    @Test
    public void additions_test(){
        // Action
        int result = mCalculator.addition(mInput01, mInput02);  // first number + second number = result.
        // Assert
        assertEquals(result, mExpect);
    }

}
