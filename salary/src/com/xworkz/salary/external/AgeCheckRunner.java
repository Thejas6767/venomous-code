package com.xworkz.salary.external;

import com.xworkz.salary.bridge.AgeCheck;

public class AgeCheckRunner {
    public static void main(String[] args) {
        AgeCheck check = (birthYear, currentYear) -> (currentYear - birthYear) >= 18;
        int birthYear = 2000;
        int currentYear = 2025;
        boolean result = check.check(birthYear, currentYear);
        System.out.println("Employee born in " + birthYear + " is old enough: " + result);
    }
}
