package com.xworkz.ecommerce.internal;

public class OrderData {
    public static String status;
    public static int totalItems;

    public OrderData(String status, int totalItems) {
        OrderData.status = status;
        OrderData.totalItems = totalItems;
    }
}
