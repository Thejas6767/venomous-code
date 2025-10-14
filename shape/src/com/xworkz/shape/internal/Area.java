package com.xworkz.shape.internal;

public class Area {
    public double length;
    public double width;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void displayDimensions() {
        System.out.println("Shape Length = " + length);
        System.out.println("Shape Width = " + width);
    }
}
