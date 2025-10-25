package com.xworkz.vehicle.internal;

public class Tire {
    public String brand;
    public double diameterInInches;
    public Vehicle vehicle;

    public Tire(String brand, double diameterInInches, Vehicle vehicle) {
        this.brand = brand;
        this.diameterInInches = diameterInInches;
        this.vehicle = vehicle;
    }

    public void tireDetails() {
        System.out.println("Tire Brand: " + brand);
        System.out.println("Tire Diameter: " + diameterInInches + " inches");
        System.out.println("Fitted on Vehicle: " + vehicle.modelName);
    }
}