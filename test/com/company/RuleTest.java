package com.company;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.TestName;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RuleTest {
    // Fields
    private Calculator calculator;

    // Rule for Class
    @ClassRule
    public static TestRule timeout = Timeout.millis(5000);

    // Rules for @Test Methods
    @Rule
    public final TestRule timeoutForMethods = Timeout.millis(1005);
    @Rule
    public final TestName testName = new TestName();
    @Rule
    public final ErrorCollector errorCollector = new ErrorCollector();

    // Custom Rule
    @Rule
    public final RuleWatchEye ruleWatchEye = new RuleWatchEye();

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator("Yellow");
    }

    @Test(timeout = 1000)
    public void time_out_annotation_test() throws InterruptedException {
        Thread.sleep(800);
    }

    @Test
    public void time_out_global_annotation_test() throws InterruptedException {
        Thread.sleep(800);
    }

    @Test
    public void error_collector_test(){
        // Action
        int result01 = calculator.addition(2,2);
        int result02 = calculator.addition(3,3);
        int result03 = calculator.addition(4,4);
        // Assertion
        errorCollector.checkThat(result01, is(3));  // wrong
        errorCollector.checkThat(result02, is(3));  // wrong
        errorCollector.checkThat(result03, is(3));  // wrong
    }

    @Test
    public void no_error_collector_test(){
        // Action
        int result01 = calculator.addition(2,2);
        int result02 = calculator.addition(3,3);
        int result03 = calculator.addition(4,4);
        // Assertion
        assertThat(result01, is(3));  // wrong
        assertThat(result02, is(3));  // wrong
        assertThat(result03, is(3));  // wrong
    }


    @Test
    public void method_name_test(){
        System.out.println("This message printed from method -> " + testName.getMethodName());
    }

}
