package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// This is the important part, which is annotations this class.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        // List all test classes you want to run them in one time
        MathematicalAdditionTest.class,
        MathematicalSubtractionTest.class,
        MathematicalMultiplicationTest.class,
        MathematicalDivisionTest.class
})

// Empty class
public class MathematicalSuiteAllTest {
}
