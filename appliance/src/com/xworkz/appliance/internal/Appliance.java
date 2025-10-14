package com.xworkz.appliance.internal;

public abstract class Appliance {
    public String modelNumber;
    public String manufacturer;
    public PowerSource powerDetails;

    public Appliance(String modelNumber, String manufacturer, PowerSource powerDetails) {
        this.modelNumber = modelNumber;
        this.manufacturer = manufacturer;
        this.powerDetails = powerDetails;
    }

    public void displayApplianceInfo() {
        System.out.println("Appliance Type = " + this.getClass().getSimpleName());
        System.out.println("Manufacturer = " + manufacturer);
        System.out.println("Model Number = " + modelNumber);
        System.out.println("Required Voltage = " + powerDetails.voltage);
        System.out.println("Operating Current = " + powerDetails.currentAmps + " Amps");
    }
}
