package com.xworkz.salary.external;

import com.xworkz.salary.bridge.Raise;

public class RaiseRunner {
    public static void main(String[] args) {
        Raise raise = (current, percent) -> current * (1.0 + percent);
        double currentSalary = 80000.00;
        double raisePercent = 0.03;
        double result = raise.increase(currentSalary, raisePercent);
        System.out.println("New Salary after 3% raise on $80000: $" + String.format("%.2f", result));
    }
}
