package com.xworkz.spaceship.internal;

public class RocketSpecs {
    public static long serialID;
    public static String payloadName;

    public RocketSpecs(long serialID, String payloadName) {
        RocketSpecs.serialID = serialID;
        RocketSpecs.payloadName = payloadName;
    }
}
