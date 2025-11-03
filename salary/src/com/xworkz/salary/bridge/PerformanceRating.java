package com.xworkz.salary.bridge;

@FunctionalInterface
public interface PerformanceRating {
    int evaluate(int goalsMet, int goalsSet);
}
