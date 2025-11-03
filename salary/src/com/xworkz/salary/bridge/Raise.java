package com.xworkz.salary.bridge;

@FunctionalInterface
public interface Raise {
    double increase(double currentSalary, double raisePercent);
}