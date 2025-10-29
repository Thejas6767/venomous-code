package com.xworkz.healthcare.internal;

public class BillingData {
    public static double totalCost;
    public static String insuranceProvider;

    public BillingData(double totalCost, String insuranceProvider) {
        BillingData.totalCost = totalCost;
        BillingData.insuranceProvider = insuranceProvider;
    }
}