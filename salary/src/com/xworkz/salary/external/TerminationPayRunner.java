package com.xworkz.salary.external;

import com.xworkz.salary.bridge.TerminationPay;

public class TerminationPayRunner {
    public static void main(String[] args) {
        TerminationPay pay = (salary, multiplier) -> salary * multiplier;
        float monthlySalary = 4000.00f;
        float multiplier = 6.0f;
        float result = pay.calculate(monthlySalary, multiplier);
        System.out.println("Severance Pay (6 months): $" + String.format("%.2f", result));
    }
}
