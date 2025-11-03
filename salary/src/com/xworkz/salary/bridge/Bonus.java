package com.xworkz.salary.bridge;

@FunctionalInterface
public interface Bonus {
    double apply(double salary, double percentage);
}
