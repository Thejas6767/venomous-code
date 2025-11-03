package com.xworkz.salary.bridge;

@FunctionalInterface
public interface AgeCheck {
    boolean check(int birthYear, int currentYear);
}