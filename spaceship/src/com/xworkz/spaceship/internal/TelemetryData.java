package com.xworkz.spaceship.internal;

public class TelemetryData {
    public static String status;
    public static double velocity;

    public TelemetryData(String status, double velocity) {
        TelemetryData.status = status;
        TelemetryData.velocity = velocity;
    }
}
