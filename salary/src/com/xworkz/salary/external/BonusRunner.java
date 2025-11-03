package com.xworkz.salary.external;

import com.xworkz.salary.bridge.Bonus;

public class BonusRunner {
    public static void main(String[] args) {
        Bonus bonus = (salary, percentage) -> salary * percentage;
        double annualSalary = 75000.00;
        double bonusPercent = 0.10;
        double result = bonus.apply(annualSalary, bonusPercent);
        System.out.println("10% Bonus on $75000: $" + String.format("%.2f", result));
    }
}
