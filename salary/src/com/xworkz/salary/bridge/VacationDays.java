package com.xworkz.salary.bridge;

@FunctionalInterface
public interface VacationDays {
    int calculate(int yearsOfService, int baseDays);
}