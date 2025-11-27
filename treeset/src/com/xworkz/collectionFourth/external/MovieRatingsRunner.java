package com.xworkz.collectionFourth.external;

import java.util.Set;
import java.util.TreeSet;

public class MovieRatingsRunner {
    public static void main(String[] args) {

        Set<Float> ratings = new TreeSet<>();

        ratings.add(4.5f);
        ratings.add(3.8f);
        ratings.add(4.9f);
        ratings.add(4.2f);
        ratings.add(4.5f);
        ratings.forEach(r -> System.out.println(r));

        ratings.clear();
        System.out.println("After clear size: " + ratings.size());

        ratings.add(3.6f);
        ratings.add(4.1f);
        ratings.add(4.8f);
        ratings.add(3.9f);
        ratings.add(4.1f);
        System.out.println(ratings);

        ratings.forEach(r -> System.out.println(r));
    }
}

