package com.company;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
// This Runner runs only @Tests Methods that annotated with CategorySlowTest.java.
@Categories.IncludeCategory(CategorySlowTest.class)
// If you want to exclude any Category use:
// @Categories.ExcludeCategory(CategorySlowTest.class)
@Suite.SuiteClasses({
        MainTest.class,
        // Or we can use our last Suite -> MathematicalSuiteAllTest.class ...
        // ... that contains all these four classes:
        MathematicalAdditionTest.class,
        MathematicalSubtractionTest.class,
        MathematicalMultiplicationTest.class,
        MathematicalDivisionTest.class
})
public class MathematicalSuiteCategoriesTest {
}

