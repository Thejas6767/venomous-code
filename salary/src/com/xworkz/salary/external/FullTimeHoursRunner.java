package com.xworkz.salary.external;

import com.xworkz.salary.bridge.FullTimeHours;

public class FullTimeHoursRunner {
    public static void main(String[] args) {
        FullTimeHours check = (weeklyHours) -> weeklyHours > 40 ? weeklyHours - 40 : 0;
        int weeklyHours = 48;
        int result = check.check(weeklyHours);
        System.out.println("Overtime hours for 48 hours worked (standard 40): " + result + " hours");
    }
}