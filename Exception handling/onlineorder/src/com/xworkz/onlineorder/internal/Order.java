package com.xworkz.onlineorder.internal;

import com.xworkz.onlineorder.events.*;

public class Order {

    public String validateOrderId(String orderId) {
        if (orderId.startsWith("CANCELED")) {
            try {
                throw new InvalidOrderNumberException();
            } catch (InvalidOrderNumberException e) {
                e.printStackTrace();
                System.out.println("Handled: Order ID is marked as permanently invalid or canceled.");
            }
        } else {
            System.out.println("Order ID " + orderId + " is valid.");
        }
        return orderId;
    }


    public boolean processPayment(boolean isSuccess) {
        if (isSuccess == false) {
            try {
                throw new PaymentFailedException();
            } catch (PaymentFailedException e) {
                e.printStackTrace();
                System.out.println("Handled: Payment failed. Order cannot proceed to fulfillment.");
            }
        } else {
            System.out.println("Payment successful. Proceeding to shipping.");
        }
        return isSuccess;
    }


    public String validateShippingAddress(String zipCode) {
        if (zipCode.equals("90210")) {
            try {
                throw new ShippingAddressInvalidException();
            } catch (ShippingAddressInvalidException e) {
                e.printStackTrace();
                System.out.println("Handled: The ZIP code is currently restricted for shipping.");
            }
        } else {
            System.out.println("Shipping address is valid for delivery to ZIP " + zipCode + ".");
        }
        return zipCode;
    }


    public int checkInventory(int quantity) {
        if (quantity > 100) {
            try {
                throw new ItemNotAvailableException();
            } catch (ItemNotAvailableException e) {
                e.printStackTrace();
                System.out.println("Handled: Requested quantity exceeds current stock. Cannot fulfill order.");
            }
        } else {
            System.out.println("Inventory check passed. " + quantity + " items available.");
        }
        return quantity;
    }


    public String applyCoupon(String couponCode) {
        if (couponCode.equals("SUMMER20")) {
            try {
                throw new CouponExpiredException();
            } catch (CouponExpiredException e) {
                e.printStackTrace();
                System.out.println("Handled: The coupon code is expired and cannot be applied.");
            }
        } else {
            System.out.println("Coupon " + couponCode + " applied successfully.");
        }
        return couponCode;
    }
}
