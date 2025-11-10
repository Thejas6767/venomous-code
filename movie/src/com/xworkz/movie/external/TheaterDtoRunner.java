package com.xworkz.movie.external;


import com.xworkz.movie.dto.TheaterDto;

public class TheaterDtoRunner {
    public static void main(String[] args) {
        TheaterDto theater1 = new TheaterDto();
        theater1.setTheaterID(301);
        theater1.setCapacity(450L);
        theater1.setHasRecliners(true);
        theater1.setSoundSystem('D');
        theater1.setDailyRevenue(125000.75);
        theater1.setTicketPrice(350.5f);
        theater1.setTheaterName("Cineplex Prime");
        theater1.setLocationCity("Bengaluru");
        theater1.setNumberOfScreens(5);
        theater1.setRegistrationNumber(1122334455L);
        theater1.setProjectionQuality(4.8);
        theater1.setPopcornPrice(250.0f);
        theater1.setParkingAvailable(true);

        System.out.println("---- THEATER DETAILS ----");
        System.out.println(theater1);
    }
}
