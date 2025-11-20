package com.xworkz.testing.external;

import com.xworkz.testing.internal.Test;

public class TestRunner {
    public static void main(String[] args) {
        Test qaProcess = new Test();

        System.out.println(" Testing Test ID ");
        qaProcess.validateTestId("TC-001");

        System.out.println("Testing Bug Severity ");
        qaProcess.checkBugSeverity(4);

        System.out.println("Testing Environment");
        qaProcess.checkEnvironment("DEV_SERVER");

        System.out.println("Testing Performance ");
        qaProcess.checkPerformance(650);

        System.out.println(" Testing Traceability ");
        qaProcess.checkTraceability("N/A");
    }
}
