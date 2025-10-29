package com.xworkz.ecommerce.external;

import com.xworkz.ecommerce.bridge.*;
import com.xworkz.ecommerce.internal.*;

public class ECommerceRunner {
    public static void main(String[] args) {
        OrderData order = new OrderData("Shipped", 3);
        ProductData product = new ProductData("Laptop Pro", 1299.99);
        CustomerData customer = new CustomerData(987654, "Alice Johnson");
        ShippingData shipping = new ShippingData("FedEx", 450987321);
        PaymentData payment = new PaymentData("Credit Card", 1299.99);

        CommerceService commerce = new CommerceServiceImpl();
        System.out.println("\n--- Testing CommerceServiceImpl ---");
        commerce.processOrder(order);
        commerce.getProduct(product);
        commerce.getCustomer(customer);
        commerce.handleShipping(shipping);
        commerce.processPayment(payment);
        System.out.println("---------------------------------");

        OrderInterface orderInt = new OrderInterfaceImpl();
        System.out.println("\n--- Testing OrderInterfaceImpl ---");
        orderInt.processOrder(order);
        orderInt.getProduct(product);
        orderInt.getCustomer(customer);
        orderInt.handleShipping(shipping);
        orderInt.processPayment(payment);
        System.out.println("---------------------------------");

        ProductInterface productInt = new ProductInterfaceImpl();
        System.out.println("\n--- Testing ProductInterfaceImpl ---");
        productInt.processOrder(order);
        productInt.getProduct(product);
        productInt.getCustomer(customer);
        productInt.handleShipping(shipping);
        productInt.processPayment(payment);
        System.out.println("---------------------------------");

        CustomerInterface customerInt = new CustomerInterfaceImpl();
        System.out.println("\n--- Testing CustomerInterfaceImpl ---");
        customerInt.processOrder(order);
        customerInt.getProduct(product);
        customerInt.getCustomer(customer);
        customerInt.handleShipping(shipping);
        customerInt.processPayment(payment);
        System.out.println("---------------------------------");

        ShippingInterface shippingInt = new ShippingInterfaceImpl();
        System.out.println("\n--- Testing ShippingInterfaceImpl ---");
        shippingInt.processOrder(order);
        shippingInt.getProduct(product);
        shippingInt.getCustomer(customer);
        shippingInt.handleShipping(shipping);
        shippingInt.processPayment(payment);
        System.out.println("---------------------------------");
    }
}