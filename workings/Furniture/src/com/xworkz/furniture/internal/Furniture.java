package com.xworkz.furniture.internal;

class Furniture {

    public void showFeatures(String material) {
        System.out.println("It's a Furniture (Base class) method");
        System.out.println("Material: " + material);
    }

    public void showFeatures(int weightCapacityLbs) {
        System.out.println("Weight Capacity (lbs): " + weightCapacityLbs);
    }

    public void showFeatures(long modelSKU) {
        System.out.println("Model SKU: " + modelSKU);
    }

    public void showFeatures(float widthInches) {
        System.out.println("Width (in): " + widthInches);
    }

    public void showFeatures(double price) {
        System.out.println("Price (USD): " + price);
    }

    public void showFeatures(char assemblyCode) {
        System.out.println("Assembly Code: " + assemblyCode);
    }

    public void showFeatures(boolean isRTA) {
        System.out.println("Ready-to-Assemble (RTA): " + isRTA);
    }
}