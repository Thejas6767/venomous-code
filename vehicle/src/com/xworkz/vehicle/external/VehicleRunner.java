package com.xworkz.vehicle.external;

import com.xworkz.vehicle.internal.*;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("Sedan X", 2023);


        Engine myEngine = new Engine("V6-T", "Gasoline", myVehicle);
        Tire myTire = new Tire("Michelin", 18.0, myVehicle);
        License myLicense = new License("State DMV", "ABC 123", myVehicle);
        Owner myOwner = new Owner("Alex Smith", myVehicle); // Insurance object removed

        System.out.println("**Vehicle Model: " + myVehicle.modelName + " (" + myVehicle.yearManufactured + ")**");
        System.out.println("---");

        myEngine.engineDetails();
        System.out.println("---");
        myTire.tireDetails();
        System.out.println("---");
        myLicense.licenseDetails();
        System.out.println("---");
        
        myOwner.ownerDetails();
    }
}