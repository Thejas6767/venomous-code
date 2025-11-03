package com.xworkz.salary.external;

import com.xworkz.salary.bridge.AnnualSalary;

public class AnnualSalaryRunner {
    public static void main(String[] args) {
        AnnualSalary salary = (monthly) -> monthly * 12;
        double monthlyPay = 5500.00;
        double result = salary.calculate(monthlyPay);
        System.out.println("Annual Salary for $5500 monthly: $" + String.format("%.2f", result));
    }
}
