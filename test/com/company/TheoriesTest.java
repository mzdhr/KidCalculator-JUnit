package com.company;

import org.junit.Before;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.*;

// This class become Theories.class Runner.
@RunWith(Theories.class)
public class TheoriesTest {

    // Fields
    private Calculator mCalculator;


    @Before
    public void setUp(){
        // Arrange
        mCalculator = new Calculator("Purple");
    }

    // Our Data Points (the inputs)
    @DataPoints
    public static int[] data() {
        return new int[]{
                2, 6, 8, 7, 3, 0
        };
    }

    // Our @Theory Method, not a @Test
    @Theory
    public void addition_even_result_test(int value1, int value2){
        // Assumptions -> assumeTrue(), assumeNotNull(), assumeNoException(), assumeThat(), etc...
        assumeTrue(value1 % 2 == 0);
        assumeTrue(value2 % 2 == 0);
        assumeTrue( value1 != 0);
        assumeTrue( value2 != 0);

        // Action
        int sumResult = mCalculator.addition(value1, value2);

        // Assert
        assertTrue( sumResult % 2 == 0);

        // Just for demonstration
        System.out.println(value1 + " + " + value2 + " = " + sumResult +" is even");
    }

}
