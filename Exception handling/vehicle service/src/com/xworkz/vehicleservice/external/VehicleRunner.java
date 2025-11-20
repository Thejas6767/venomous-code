package com.xworkz.vehicleservice.external;

import com.xworkz.vehicleservice.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();

        System.out.println("Testing VIN ");
        car.checkVIN("BADVIN123");

        System.out.println(" Testing Mileage ");
        car.checkMileage(125000);

        System.out.println(" Testing Registration Status");
        car.checkRegistration("Expired");

        System.out.println("Testing Color");

        car.checkColor("YELLOW");

        System.out.println(" Testing Tire Pressure");
        car.checkTirePressure(22.5f);
    }
}
