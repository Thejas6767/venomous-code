package com.xworkz.ecommerce.bridge;

import com.xworkz.ecommerce.internal.*;

public class ProductInterfaceImpl implements ProductInterface {
    @Override
    public OrderData processOrder(OrderData orderData) {
        System.out.println("this is 1st sub class - Order Status: " + OrderData.status + ", Items: " + OrderData.totalItems);
        return orderData;
    }
    @Override
    public ProductData getProduct(ProductData productData) {
        System.out.println("this is 2nd sub class - Product: " + ProductData.productName + ", Price: $" + ProductData.price);
        return productData;
    }
    @Override
    public CustomerData getCustomer(CustomerData customerData) {
        System.out.println("this is 3rd sub class - Customer ID: " + CustomerData.customerID + ", Name: " + CustomerData.customerName);
        return customerData;
    }
    @Override
    public ShippingData handleShipping(ShippingData shippingData) {
        System.out.println("this is 4th sub class - Carrier: " + ShippingData.carrier + ", Tracking: " + ShippingData.trackingNumber);
        return shippingData;
    }
    @Override
    public PaymentData processPayment(PaymentData paymentData) {
        System.out.println("this is 5th sub class - Payment Method: " + PaymentData.method + ", Amount: $" + PaymentData.amountPaid);
        return paymentData;
    }
}
