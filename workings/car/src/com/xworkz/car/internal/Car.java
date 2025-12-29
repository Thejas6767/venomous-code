package com.xworkz.car.internal;

public class Car {
    public void displayCarDetails(String make) {
        System.out.println("Car Make: " + make);
    }
    public void displayCarDetails(String make, String model) {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
    }
    public void displayCarDetails(String make, String model, int year) {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
    public void displayCarDetails(String make, String model, int year, double engineSize) {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Size: " + engineSize + "L");
    }
    public void displayCarDetails(String make, String model, int year, double engineSize, String color) {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Size: " + engineSize + "L");
        System.out.println("Color: " + color);
    }
    public void displayCarDetails(String make, String model, int year, double engineSize, String color,
                                  boolean isElectric) {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Size: " + engineSize + "L");
        System.out.println("Color: " + color);
        System.out.println("Is Electric: " + isElectric);
    }
    public void displayCarDetails(String make, String model, int year, double engineSize, String color,
                                  boolean isElectric, int priceInThousands) {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Size: " + engineSize + "L");
        System.out.println("Color: " + color);
        System.out.println("Is Electric: " + isElectric);
        System.out.println("Approximate Price: $" + priceInThousands + ",000");
    }
}