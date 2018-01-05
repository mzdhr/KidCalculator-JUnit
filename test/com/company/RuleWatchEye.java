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
                // ---------- Write Behavior ----------
                long start = System.currentTimeMillis();
                try {
                    // This code will run when each of @Test Methods runs.
                    base.evaluate();    // Trigger for our @Test Methods code's.
                    System.out.println();
                    System.out.println("Method   ---> " + description.getMethodName());
                    System.out.println("In Class ---> " + description.getTestClass().getName());
                } finally {
                    // This code will run when each of @Test Methods is finish running.
                    System.out.println("Takes    ---> " + (System.currentTimeMillis() - start) + " Millisecond");
                }
                // ---------- End of Behavior ----------
            }

        };

    }


}
