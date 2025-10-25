package com.xworkz.shape.external;

import com.xworkz.shape.internal.Area;
import com.xworkz.shape.internal.Rectangle;
import com.xworkz.shape.internal.Shape;

public class ShapeRunner {
    public static void main(String[] args) {

        Area rectangleDimensions = new Area(10.5, 5.0);
        Shape rectangle = new Rectangle("Blue", rectangleDimensions);
        rectangle.displayShapeInfo();
    }
}
