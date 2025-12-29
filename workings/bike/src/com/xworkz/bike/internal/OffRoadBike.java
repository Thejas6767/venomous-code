package com.xworkz.bike.internal;

public class OffRoadBike {
    public String brand;
    public String modelName;
    public Engine engine;
    public Frame frame;
    public Tires tires;

    public OffRoadBike(String brand, String modelName, Engine engine, Frame frame, Tires tires) {
        this.brand = brand;
        this.modelName = modelName;
        this.engine = engine;
        this.frame = frame;
        this.tires = tires;
    }

    public void displayDetails() {
        System.out.println("Bike Type: Off-Road Bike");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Engine: " + engine.engineType + " (" + engine.displacementCC + "cc)");
        System.out.println("Frame: " + frame.frameType + " (" + frame.material + ")");
        System.out.println("Tires: Front - " + tires.frontTire + ", Rear - " + tires.rearTire);
    }
}