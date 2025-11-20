package com.xworkz.testing.internal;

import com.xworkz.testing.event.*;

public class Test {

    public String validateTestId(String testId) {
        if (testId.length() != 8) {
            try {
                throw new TestIDNotFoundException();
            } catch (TestIDNotFoundException e) {
                e.printStackTrace();
                System.out.println("Handled: Test ID format incorrect or not found in system.");
            }
        } else {
            System.out.println("Test ID " + testId + " is valid and found.");
        }
        return testId;
    }


    public int checkBugSeverity(int severity) {
        if (severity >= 4) {
            try {
                throw new SevereBugFoundException();
            } catch (SevereBugFoundException e) {
                e.printStackTrace();
                System.out.println("Handled: A severe bug was found. Halting further testing on this build.");
            }
        } else {
            System.out.println("Bug severity (" + severity + ") is acceptable for continuous testing.");
        }
        return severity;
    }


    public String checkEnvironment(String currentEnv) {
        if (!currentEnv.equals("STAGING_SERVER")) {
            try {
                throw new EnvironmentMismatchException();
            } catch (EnvironmentMismatchException e) {
                e.printStackTrace();
                System.out.println("Handled: Testing environment is " + currentEnv + ", but must be 'STAGING_SERVER'.");
            }
        } else {
            System.out.println("Environment (" + currentEnv + ") is correctly configured for the test run.");
        }
        return currentEnv;
    }


    public long checkPerformance(long responseTimeMs) {
        if (responseTimeMs > 500) {
            try {
                throw new PerformanceThresholdExceededException();
            } catch (PerformanceThresholdExceededException e) {
                e.printStackTrace();
                System.out.println("Handled: Response time (" + responseTimeMs + " ms) exceeded the maximum allowed threshold (500 ms).");
            }
        } else {
            System.out.println("Performance within acceptable limits (" + responseTimeMs + " ms).");
        }
        return responseTimeMs;
    }


    public String checkTraceability(String requirementId) {
        if (requirementId.isEmpty() || requirementId.equals("N/A")) {
            try {
                throw new RequirementsTraceabilityMissingException();
            } catch (RequirementsTraceabilityMissingException e) {
                e.printStackTrace();
                System.out.println("Handled: Test case is not linked to a valid requirement. Cannot proceed to official sign-off.");
            }
        } else {
            System.out.println("Test case is traceable to requirement ID: " + requirementId + ".");
        }
        return requirementId;
    }
}
