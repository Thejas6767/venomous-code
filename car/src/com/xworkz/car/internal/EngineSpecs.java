package com.xworkz.car.internal;

public class EngineSpecs {
    public static long serialNumber;
    public static String engineType;

    public EngineSpecs(long serialNumber, String engineType) {
        EngineSpecs.serialNumber = serialNumber;
        EngineSpecs.engineType = engineType;
    }
}