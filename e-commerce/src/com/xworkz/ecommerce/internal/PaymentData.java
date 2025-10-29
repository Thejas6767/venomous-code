package com.xworkz.ecommerce.internal;

public class PaymentData {
    public static String method;
    public static double amountPaid;

    public PaymentData(String method, double amountPaid) {
        PaymentData.method = method;
        PaymentData.amountPaid = amountPaid;
    }
}
