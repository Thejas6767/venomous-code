package com.xworkz.spaceship.external;

import com.xworkz.spaceship.bridge.*;
import com.xworkz.spaceship.internal.*;

public class MissionRunner {
    public static void main(String[] args) {
        MissionInfo mission = new MissionInfo("Mars Rover Deployment", 700);
        RocketSpecs rocket = new RocketSpecs(80010927L, "Perseverance Rover");
        CrewDetails crew = new CrewDetails("J. Carter", 0); // Unmanned mission
        TelemetryData telemetry = new TelemetryData("Nominal", 12.5);
        OrbitDetails orbit = new OrbitDetails(200, "Mars Transfer");

        MissionControl control = new MissionControlImpl();
        System.out.println("\n--- Testing MissionControlImpl ---");
        control.MissionInfo(mission);
        control.RocketSpecs(rocket);
        control.CrewDetails(crew);
        control.TelemetryData(telemetry);
        control.OrbitDetails(orbit);
        System.out.println("---------------------------------");

        LaunchSystem launch = new LaunchSystemImpl();
        System.out.println("\n--- Testing LaunchSystemImpl ---");
        launch.MissionInfo(mission);
        launch.RocketSpecs(rocket);
        launch.CrewDetails(crew);
        launch.TelemetryData(telemetry);
        launch.OrbitDetails(orbit);
        System.out.println("---------------------------------");

        CommunicationLink link = new CommunicationLinkImpl();
        System.out.println("\n--- Testing CommunicationLinkImpl ---");
        link.MissionInfo(mission);
        link.RocketSpecs(rocket);
        link.CrewDetails(crew);
        link.TelemetryData(telemetry);
        link.OrbitDetails(orbit);
        System.out.println("---------------------------------");

        GroundSupport support = new GroundSupportImpl();
        System.out.println("\n--- Testing GroundSupportImpl ---");
        support.MissionInfo(mission);
        support.RocketSpecs(rocket);
        support.CrewDetails(crew);
        support.TelemetryData(telemetry);
        support.OrbitDetails(orbit);
        System.out.println("---------------------------------");

        Navigation navigation = new NavigationImpl();
        System.out.println("\n--- Testing NavigationImpl ---");
        navigation.MissionInfo(mission);
        navigation.RocketSpecs(rocket);
        navigation.CrewDetails(crew);
        navigation.TelemetryData(telemetry);
        navigation.OrbitDetails(orbit);
        System.out.println("---------------------------------");
    }
}