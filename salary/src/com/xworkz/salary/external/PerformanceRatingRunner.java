package com.xworkz.salary.external;

import com.xworkz.salary.bridge.PerformanceRating;

public class PerformanceRatingRunner {
    public static void main(String[] args) {
        PerformanceRating rating = (met, set) -> (met * 100) / set;
        int goalsMet = 9;
        int goalsSet = 10;
        int result = rating.evaluate(goalsMet, goalsSet);
        System.out.println("Performance Rating (9/10 goals met): " + result + "%");
    }
}
