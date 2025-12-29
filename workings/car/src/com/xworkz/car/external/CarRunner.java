package com.xworkz.car.external;

import com.xworkz.car.internal.Car;

class CarRunner {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("Displaying with make only:");
        myCar.displayCarDetails("Ford");

        System.out.println("\nDisplaying with make and model:");
        myCar.displayCarDetails("Ford", "Mustang");

        System.out.println("\nDisplaying with make, model, and year:");
        myCar.displayCarDetails("Ford", "Mustang", 2024);

        System.out.println("\nDisplaying with make, model, year, and engine size:");
        myCar.displayCarDetails("Ford", "Mustang", 2024, 5.0);

        System.out.println("\nDisplaying with make, model, year, engine size, and color:");
        myCar.displayCarDetails("Ford", "Mustang", 2024, 5.0, "Red");

        System.out.println("\nDisplaying with make, model, year, engine size, color, and electric status:");
        myCar.displayCarDetails("Ford", "Mustang", 2024, 5.0, "Red", false);

        System.out.println("\nDisplaying with all details, including price:");
        myCar.displayCarDetails("Ford", "Mustang", 2024, 5.0, "Red", false, 60);
    }
}