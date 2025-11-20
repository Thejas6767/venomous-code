package com.xworkz.onlineorder.external;

import com.xworkz.onlineorder.internal.Order;

public class OrderRunner {
    public static void main(String[] args) {
        Order onlineOrder = new Order();

        System.out.println("Testing Order ID ");
        onlineOrder.validateOrderId("CANCELED-12345");

        System.out.println(" Testing Payment ");
        onlineOrder.processPayment(false);

        System.out.println(" Testing Shipping Address ");
        onlineOrder.validateShippingAddress("90210");

        System.out.println(" Testing Inventory ");
        onlineOrder.checkInventory(101);

        System.out.println("Testing Coupon");
        onlineOrder.applyCoupon("SUMMER20");
    }
}
