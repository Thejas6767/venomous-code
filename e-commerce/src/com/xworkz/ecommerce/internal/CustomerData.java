package com.xworkz.ecommerce.internal;

public class CustomerData {
    public static long customerID;
    public static String customerName;

    public CustomerData(long customerID, String customerName) {
        CustomerData.customerID = customerID;
        CustomerData.customerName = customerName;
    }
}