package com.xworkz.encapsulation.external;


import com.xworkz.encapsulation.dto.ProductDto;

public class ProductDtoRunner {
    public static void main(String[] args) {

        ProductDto product1 = new ProductDto(1001, "Laptop", 75000.0, true);
        ProductDto product2 = new ProductDto(1002, "Smartphone", 25000.0, false);
        ProductDto product3 = new ProductDto(1001, "Laptop", 75000.0, true);

        System.out.println(product1.toString());
        System.out.println(product2.toString());

        if (product1.equals(product3)) {
            System.out.println("Product 1 and Product 3 are the same items.");
        } else {
            System.out.println("These are different products.");
        }

        if (product2.isAvailable()) {
            System.out.println(product2.getProductName() + " is in stock.");
        } else {
            System.out.println(product2.getProductName() + " is currently out of stock.");
        }

        System.out.println("Product 1 Hash: " + product1.hashCode());
        System.out.println("Product 3 Hash: " + product3.hashCode());
    }
}
