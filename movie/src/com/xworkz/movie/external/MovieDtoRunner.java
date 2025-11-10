package com.xworkz.movie.external;


import com.xworkz.movie.dto.MovieDto;

public class MovieDtoRunner {
    public static void main(String[] args) {
        MovieDto movie1 = new MovieDto();
        movie1.setMovieID(101);
        movie1.setBoxOfficeCollection(550000000L);
        movie1.setIs3D(true);
        movie1.setCertification('A');
        movie1.setBudget(75000000.0);
        movie1.setRuntimeHours(2.5f);
        movie1.setTitle("The Final Code");
        movie1.setDirector("Jane Doe");
        movie1.setReleaseYear(2025);
        movie1.setImdbVotes(150000L);
        movie1.setImdbRating(8.9);
        movie1.setUserRating(9.2f);
        movie1.setIsHit(true);

        MovieDto movie2 = new MovieDto();
        movie2.setMovieID(101);
        movie2.setBoxOfficeCollection(550000000L);
        movie2.setIs3D(true);
        movie2.setCertification('A');
        movie2.setBudget(75000000.0);
        movie2.setRuntimeHours(2.5f);
        movie2.setTitle("The Final Code");
        movie2.setDirector("Jane Doe");
        movie2.setReleaseYear(2025);
        movie2.setImdbVotes(150000L);
        movie2.setImdbRating(8.9);
        movie2.setUserRating(9.2f);
        movie2.setIsHit(true);

        System.out.println("---- MOVIE 1 DETAILS ----");
        System.out.println(movie1);

        System.out.println("---- MOVIE 2 DETAILS ----");
        System.out.println(movie2);

        System.out.println("HashCode of Movie1: " + movie1.hashCode());
        System.out.println("HashCode of Movie2: " + movie2.hashCode());
        System.out.println("Are both objects equal? " + movie1.equals(movie2));
    }
}
