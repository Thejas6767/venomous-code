package com.xworkz.vehicle.internal;

public class Owner {
    public String ownerName;
    public Vehicle vehicle;

    public Owner(String ownerName, Vehicle vehicle) {
        this.ownerName = ownerName;
        this.vehicle = vehicle;
    }

    public void ownerDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Owns Vehicle: " + vehicle.modelName);
    }
}
