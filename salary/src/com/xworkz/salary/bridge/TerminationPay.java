package com.xworkz.salary.bridge;

@FunctionalInterface
public interface TerminationPay {
    float calculate(float salary, float severanceMultiplier);
}
