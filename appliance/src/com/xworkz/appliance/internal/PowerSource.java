package com.xworkz.appliance.internal;

public class PowerSource {
    public String voltage;
    public double currentAmps;

    public PowerSource(String voltage, double currentAmps) {
        this.voltage = voltage;
        this.currentAmps = currentAmps;
    }

    public void displayPowerInfo() {
        System.out.println("Voltage = " + voltage);
        System.out.println("Current (Amps) = " + currentAmps);
    }
}
