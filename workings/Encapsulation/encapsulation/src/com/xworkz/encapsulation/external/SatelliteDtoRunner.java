package com.xworkz.encapsulation.external;


import com.xworkz.encapsulation.dto.SatelliteDto;

public class SatelliteDtoRunner {
    public static void main(String[] args) {

        SatelliteDto satellite1 = new SatelliteDto("Aryabhata", 1975, 594.0, false);
        SatelliteDto satellite2 = new SatelliteDto("Mangalyaan", 2013, 421.7, true);
        SatelliteDto satellite3 = new SatelliteDto("Aryabhata", 1975, 594.0, false);

        System.out.println(satellite1.toString());
        System.out.println(satellite2.toString());

        if (satellite1.equals(satellite3)) {
            System.out.println("satellite1 and satellite3 represent the same mission data.");
        } else {
            System.out.println("These represent different missions.");
        }

        if (satellite2.isOperational()) {
            System.out.println(satellite2.getName() + " is currently active in orbit.");
        } else {
            System.out.println(satellite2.getName() + " is no longer active.");
        }

        System.out.println("S1 HashCode: " + satellite1.hashCode());
        System.out.println("S3 HashCode: " + satellite3.hashCode());
    }
}