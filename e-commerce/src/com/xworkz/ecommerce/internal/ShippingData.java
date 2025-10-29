package com.xworkz.ecommerce.internal;

public class ShippingData {
    public static String carrier;
    public static int trackingNumber;

    public ShippingData(String carrier, int trackingNumber) {
        ShippingData.carrier = carrier;
        ShippingData.trackingNumber = trackingNumber;
    }
}
