package com.xworkz.shape.internal;

public abstract class Shape {
    public int noOfSides;
    public String shapeColor;
    public Area dimensions;

    public Shape(int noOfSides, String shapeColor, Area dimensions) {
        this.noOfSides = noOfSides;
        this.shapeColor = shapeColor;
        this.dimensions = dimensions;
    }

    public void displayShapeInfo() {
        System.out.println("Number of sides = " + noOfSides);
        System.out.println("Shape color = " + shapeColor);
        System.out.println("Shape Length = " + dimensions.length);
        System.out.println("Shape Width = " + dimensions.width);

    }
}
