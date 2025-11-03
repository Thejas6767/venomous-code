package com.xworkz.salary.bridge;

@FunctionalInterface
public interface AnnualSalary {
    double calculate(double monthlySalary);
}
