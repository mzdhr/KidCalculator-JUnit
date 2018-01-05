package com.company;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)   // This class become Parameterized.class Runner, rather than the default JUnit Runner.
public class ParameterizedTest {

    // Fields
    private Calculator mCalculator;
    private int mInput01;   // used as input for the first number.
    private int mInput02;   // used as input for the second number.
    private int mExpect;    // used as output for expect test result.


    @Before
    public void setUp(){
        // Arrange
        mCalculator = new Calculator("Orange");
    }


    // Notation for that data, that we want to test it as parameters inputs.
    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {2, 4, 6},
                {4, 4, 8},
                {11, 4, 2}
        });
    }


    // Class Construction, to hook the values to test()
    public ParameterizedTest(int input01, int input02, int expected){
        mInput01 = input01;
        mInput02 = input02;
        mExpect = expected;
    }


    // Our only test method, that gonna test all inputs and outputs.
    // Rather than writing too many methods for each inputs and outputs.
    @Test
    public void test(){
        // Action
        int result = mCalculator.addition(mInput01, mInput02);  // first number + second number = result.
        // Assert
        assertEquals(result, mExpect);  // Is result == mExpect?
    }

}
