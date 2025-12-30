package com.xworkz.encapsulation.external;


import com.xworkz.encapsulation.dto.VehicleDto;

public class VehicleDtoRunner {
    public static void main(String[] args) {

        VehicleDto v1 = new VehicleDto("Toyota", "Fortuner", 2024, 3500000.0);
        VehicleDto v2 = new VehicleDto("Mahindra", "Thar", 2023, 1800000.0);
        VehicleDto v3 = new VehicleDto("Toyota", "Fortuner", 2024, 3500000.0);

        System.out.println("Vehicle 1: " + v1.toString());
        System.out.println("Vehicle 2: " + v2.toString());

        if (v1.equals(v3)) {
            System.out.println("Vehicle 1 and Vehicle 3 are identical models.");
        } else {
            System.out.println("Vehicles are different.");
        }

        if (v1.getPrice() > 2000000.0) {
            System.out.println(v1.getModelName() + " is a premium vehicle.");
        }

        System.out.println("HashCode of V1: " + v1.hashCode());
        System.out.println("HashCode of V3: " + v3.hashCode());
    }
}
