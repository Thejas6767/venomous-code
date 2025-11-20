package com.xworkz.product.external;

import com.xworkz.product.internal.Product;

public class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product();

        System.out.println("Testing Product ID" );
        product.productID(999);

        System.out.println(" Testing Stock");
        product.checkStock(5);

        System.out.println("Testing Status ");
        product.checkStatus("discontinued");

        System.out.println("Testing Category ");
        product.checkCategory("FOOD");

        System.out.println(" Testing Manufacturing Date");
        product.checkManufacturingDate(2022);
    }
}
