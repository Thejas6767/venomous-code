package com.xworkz.testing.event;

public class PerformanceThresholdExceededException extends Exception {
    public PerformanceThresholdExceededException() {
        System.err.println(" PerformanceThresholdExceededException ");
    }
}
