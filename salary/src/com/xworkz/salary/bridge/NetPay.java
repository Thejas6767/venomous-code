package com.xworkz.salary.bridge;

@FunctionalInterface
public interface NetPay {
    double compute(double grossPay, double taxRate);
}
