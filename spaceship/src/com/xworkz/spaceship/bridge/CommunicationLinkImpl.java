package com.xworkz.spaceship.bridge;

import com.xworkz.spaceship.internal.*;

public class CommunicationLinkImpl implements CommunicationLink {
    @Override
    public MissionInfo MissionInfo(MissionInfo missionInfo) {
        System.out.println("this is 1st sub class - Mission: " + MissionInfo.missionName + ", Duration: " + MissionInfo.durationDays + " days");
        return missionInfo;
    }
    @Override
    public RocketSpecs RocketSpecs(RocketSpecs rocketSpecs) {
        System.out.println("this is 2nd sub class - Rocket S/N: " + RocketSpecs.serialID + ", Payload: " + RocketSpecs.payloadName);
        return rocketSpecs;
    }
    @Override
    public CrewDetails CrewDetails(CrewDetails crewDetails) {
        System.out.println("this is 3rd sub class - Commander: " + CrewDetails.commander + ", Size: " + CrewDetails.crewSize);
        return crewDetails;
    }
    @Override
    public TelemetryData TelemetryData(TelemetryData telemetryData) {
        System.out.println("this is 4th sub class - Status: " + TelemetryData.status + ", Velocity: " + TelemetryData.velocity + " km/s");
        return telemetryData;
    }
    @Override
    public OrbitDetails OrbitDetails(OrbitDetails orbitDetails) {
        System.out.println("this is 5th sub class - Altitude: " + OrbitDetails.altitudeKM + "km, Destination: " + OrbitDetails.destination);
        return orbitDetails;
    }
}
