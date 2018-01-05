package com.company;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(CategorySlowTest.class)     // We will make this suite runs only Tests that market as Slow.
@Suite.SuiteClasses({
        MainTest.class,
        MathematicalAdditionTest.class,         // Or we can use our last Suite -> MathematicalSuiteAllTest.class ...
        MathematicalSubtractionTest.class,      // ... that contains all these four classes.
        MathematicalMultiplicationTest.class,
        MathematicalDivisionTest.class
})

public class MathematicalSuiteCategoriesTest {
}
