package com.yourcompany.TestRules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by mehmetgerceker on 12/7/15.
 */
public class RetryRule implements TestRule {

    private final int retryCount;

    public RetryRule(int retries){
        this.retryCount = retries;
    }

    @Override
    public Statement apply(final Statement base, final Description description) {
        //statement is a private method which will return a new statement
        //here Statement is taken as abstract for your test which includes test method and before/after methods )
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Throwable caughtThrowable = null;

                // implement retry logic here
                int i = retryCount;
                while (i-- > 0) {
                    try {
                        base.evaluate();
                        return;
                    } catch (Throwable t) {
                        caughtThrowable = t;
                        if (i > 0 && description.getAnnotation(Retry.class)!= null) {
                            System.err.println(description.getDisplayName() +
                                    ": Failed, " + i + "retries remain");
                        } else {
                            throw caughtThrowable;
                        }
                    }
                }
            }
        };
    }
}
