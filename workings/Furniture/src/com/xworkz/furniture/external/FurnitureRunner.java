package com.xworkz.furniture.external;

import com.xworkz.furniture.internal.Chair;

class FurnitureRunner {
    public static void main(String [] args) {

        Chair officeChair = new Chair();

        officeChair.showFeatures("Mesh Fabric");

        officeChair.showFeatures(300);

        officeChair.showFeatures(448877665544L);

        officeChair.showFeatures(24.5f);

        officeChair.showFeatures(149.99d);

        officeChair.showSeatHeight('D');

        officeChair.showAdjustableArms(true);
    }
}
