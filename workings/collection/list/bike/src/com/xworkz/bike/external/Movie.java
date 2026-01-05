package com.xworkz.bike.external;


import java.util.ArrayList;
import java.util.List;

public class Movie{
    public Movie(String inception, double v) {

    }

    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();

        list.add(new Movie("Inception", 8.8));
        list.add(new Movie("Interstellar", 8.7));
        list.add(new Movie("Batman", 9.0));

        System.out.println(list.toString());
        System.out.println("Size: " + list.size());

        list.clear();
        System.out.println("Size after clear: " + list.size());

        list.add(new Movie("Kalki", 8.5));
        list.add(new Movie("RRR", 8.0));
        list.add(new Movie("Kantara", 8.2));
        list.add(new Movie("RRR", 8.0));

        System.out.println(list.toString());
        System.out.println("Final size: " + list.size());
    }
}