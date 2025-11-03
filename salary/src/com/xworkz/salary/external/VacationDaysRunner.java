package com.xworkz.salary.external;

import com.xworkz.salary.bridge.VacationDays;

public class VacationDaysRunner {
    public static void main(String[] args) {
        VacationDays days = (yos, base) -> base + (yos * 2);
        int years = 5;
        int base = 10;
        int result = days.calculate(years, base);
        System.out.println("Vacation Days for 5 years service (10 base + 2/yr): " + result + " days");
    }
}