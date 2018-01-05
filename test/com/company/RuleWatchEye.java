package com.company;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;


public class RuleWatchEye implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {

                long start = System.currentTimeMillis();
                try {
                    base.evaluate();
                    System.out.println();
                    System.out.println("Method   ---> " + description.getMethodName());
                    System.out.println("In Class ---> " + description.getTestClass().getName());
                } finally {
                    System.out.println("Takes    ---> " + (System.currentTimeMillis() - start) + " Millisecond");
                }


            }
        };
    }

}
