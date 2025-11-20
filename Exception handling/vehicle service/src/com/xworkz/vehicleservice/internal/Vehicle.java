package com.xworkz.vehicleservice.internal;

import com.xworkz.vehicleservice.event.*;

public class Vehicle {

    public String checkVIN(String vin) {
        if (vin.equals("BADVIN123")) {
            try {
                throw new InvalidVINException();
            } catch (InvalidVINException e) {
                e.printStackTrace();
                System.out.println("Handled: The provided VIN is invalid or blacklisted.");
            }
        } else {
            System.out.println("Vehicle VIN (" + vin + ") is valid.");
        }
        return vin;
    }


    public int checkMileage(int mileage) {
        if (mileage > 100000) {
            try {
                throw new MaintenanceDueException();
            } catch (MaintenanceDueException e) {
                e.printStackTrace();
                System.out.println("Handled: Vehicle mileage is over 100,000 km. Major service is due.");
            }
        } else {
            System.out.println("Vehicle mileage (" + mileage + " km) is within standard service interval.");
        }
        return mileage;
    }


    public String checkRegistration(String status) {
        if (status.equals("Expired")) {
            try {
                throw new ExpiredRegistrationException();
            } catch (ExpiredRegistrationException e) {
                e.printStackTrace();
                System.out.println("Handled: Vehicle registration has expired. Cannot operate legally.");
            }
        } else {
            System.out.println("Vehicle registration is active.");
        }
        return status;
    }


    public String checkColor(String actualColor) {
        if (actualColor.equals("YELLOW")) {
            try {
                throw new ColorMismatchException();
            } catch (ColorMismatchException e) {
                e.printStackTrace();
                System.out.println("Handled: The actual color ('YELLOW') does not match the expected color ('BLUE') in the record.");
            }
        } else {
            System.out.println("Vehicle color (" + actualColor + ") matches the expected record.");
        }
        return actualColor;
    }


    public float checkTirePressure(float psi) {
        if (psi < 25.0f) {
            try {
                throw new TirePressureLowException();
            } catch (TirePressureLowException e) {
                e.printStackTrace();
                System.out.println("Handled: Tire pressure (" + psi + " PSI) is critically low.");
            }
        } else {
            System.out.println("Tire pressure (" + psi + " PSI) is within the safe range.");
        }
        return psi;
    }
}