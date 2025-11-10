package com.xworkz.movie.external;


import com.xworkz.movie.dto.ActorDto;

public class ActorDtoRunner {
    public static void main(String[] args) {
        ActorDto actor1 = new ActorDto();
        actor1.setActorID(201);
        actor1.setSalary(5000000L);
        actor1.setOscarWinner(false);
        actor1.setPopularityGrade('A');
        actor1.setNetWorth(50.5);
        actor1.setHeightFeet(5.8f);
        actor1.setActorName("Chris Evans");
        actor1.setBornCity("Boston");
        actor1.setDebutYear(2000);
        actor1.setFollowersCount(80000000L);
        actor1.setAvgMovieRating(7.5);
        actor1.setAge(42.0f);
        actor1.setIsActive(true);

        System.out.println("---- ACTOR DETAILS ----");
        System.out.println(actor1);
    }
}
