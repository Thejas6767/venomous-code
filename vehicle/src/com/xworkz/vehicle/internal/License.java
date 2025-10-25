package com.xworkz.vehicle.internal;

public class License {
    public String issuingAuthority;
    public String plateNumber;
    public Vehicle vehicle;

    public License(String issuingAuthority, String plateNumber, Vehicle vehicle) {
        this.issuingAuthority = issuingAuthority;
        this.plateNumber = plateNumber;
        this.vehicle = vehicle;
    }

    public void licenseDetails() {
        System.out.println("License Authority: " + issuingAuthority);
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Licensed Vehicle: " + vehicle.modelName);
    }
}