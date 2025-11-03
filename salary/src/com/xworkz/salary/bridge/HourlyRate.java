package com.xworkz.salary.bridge;

@FunctionalInterface
public interface HourlyRate {
    double determine(int totalPay, int hoursWorked);
}
