package com.xworkz.spaceship.bridge;

import com.xworkz.spaceship.internal.*;

public interface LaunchSystem {
    MissionInfo MissionInfo(MissionInfo missionInfo);
    RocketSpecs RocketSpecs(RocketSpecs rocketSpecs);
    CrewDetails CrewDetails(CrewDetails crewDetails);
    TelemetryData TelemetryData(TelemetryData telemetryData);
    OrbitDetails OrbitDetails(OrbitDetails orbitDetails);
}