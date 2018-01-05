package com.company;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)    // This class become Theories.class Runner, rather than the default JUnit Runner.
public class TheoriesTest {

//    @DataPoint
//    public static int da = 4;
//
//    @DataPoint
//    public static int da2 = 2;
//
//    @DataPoint
//    public static int da3 = 1;


    @DataPoints
    public static int[] data() {
        return new int[]{
                3, 1, 2, 4, 7, 9
        };
    }


    @Theory
    public void test(int value1, int value2){
        Calculator calculator = new Calculator("Purple");
        int range = calculator.addition(value1, value2);
        assertTrue(range > 0 && range < 20);
        System.out.println(value1 + " + " + value2 + " = " + range);
    }

}
