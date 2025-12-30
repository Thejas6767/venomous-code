package com.xworkz.shapes.external;


import com.xworkz.shapes.internal.Circle;
import com.xworkz.shapes.internal.Square;
import com.xworkz.shapes.internal.Triangle;

public class ShapeRunner {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.drawCircle();
        circle.area();


        Square square = new Square();
        square.drawSquare();
        square.area();
        Triangle triangle = new Triangle();
        triangle.drawTriangle();
        triangle.area();
    }
}
