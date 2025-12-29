package com.xworkz.furniture.internal;

public class Chair extends Furniture {

    public void showFeatures(String material) {
        System.out.println("It's a Chair (Derived class) method");
        System.out.println("Primary Material: " + material);
    }

    public void showFeatures(int weightCapacityLbs) {
        System.out.println("Weight Capacity (lbs): " + weightCapacityLbs);
    }

    public void showFeatures(long modelSKU) {
        System.out.println(modelSKU);
    }

    public void showFeatures(float widthInches) {
        System.out.println(widthInches);
    }

    public void showFeatures(double price) {
        System.out.println(price);
    }

    public void showSeatHeight(char heightCode) {
        System.out.println("Seat Height Code: " + heightCode);
    }

    public void showAdjustableArms(boolean hasAdjustableArms) {
        System.out.println("Has Adjustable Arms: " + hasAdjustableArms);
    }
}