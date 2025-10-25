package com.xworkz.vehicle.internal;

public class Engine {
    public String engineCode;
    public String fuelType;
    public Vehicle vehicle;

    public Engine(String engineCode, String fuelType, Vehicle vehicle) {
        this.engineCode = engineCode;
        this.fuelType = fuelType;
        this.vehicle = vehicle;
    }

    public void engineDetails() {
        System.out.println("Engine Code: " + engineCode);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Installed in Vehicle: " + vehicle.modelName);
    }
}