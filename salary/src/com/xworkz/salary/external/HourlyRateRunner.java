package com.xworkz.salary.external;

import com.xworkz.salary.bridge.HourlyRate;

public class HourlyRateRunner {
    public static void main(String[] args) {
        HourlyRate rate = (pay, hours) -> (double) pay / hours;
        int totalPay = 1500;
        int hoursWorked = 40;
        double result = rate.determine(totalPay, hoursWorked);
        System.out.println("Hourly Rate ($1500 for 40 hours): $" + String.format("%.2f", result));
    }
}
