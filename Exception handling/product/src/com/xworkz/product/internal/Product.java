package com.xworkz.product.internal;

import com.xworkz.product.event.*;

public class Product {

    public int productID(int id) {
        if (id == 999) {
            try {
                throw new InvalidProductIDException();
            } catch (InvalidProductIDException e) {
                e.printStackTrace();
                System.out.println("Handled: The provided ID (999) is invalid or blacklisted.");
            }
        } else {
            System.out.println("Product ID " + id + " is valid.");
        }
        return id;
    }


    public int checkStock(int quantity) {
        if (quantity < 10) {
            try {
                throw new LowStockException();
            } catch (LowStockException e) {
                e.printStackTrace();
                System.out.println("Handled: Product stock is below the reorder level. Reorder immediately.");
            }
        } else {
            System.out.println("Product stock of " + quantity + " is sufficient.");
        }
        return quantity;
    }


    public String checkStatus(String status) {
        if (status.equals("discontinued")) {
            try {
                throw new DiscontinuedProductException();
            } catch (DiscontinuedProductException e) {
                e.printStackTrace();
                System.out.println("Handled: This product has been marked as discontinued and should not be sold.");
            }
        } else {
            System.out.println("Product is currently active.");
        }
        return status;
    }


    public String checkCategory(String category) {
        if (category.equals("FOOD")) {
            try {
                throw new CategoryMismatchException();
            } catch (CategoryMismatchException e) {
                e.printStackTrace();
                System.out.println("Handled: Product is categorized as 'FOOD' but was expected to be 'TOOL'.");
            }
        } else {
            System.out.println("Product is in the correct category (" + category + ").");
        }
        return category;
    }


    public int checkManufacturingDate(int year) {
        if (year < 2023) {
            try {
                throw new ExpiredDateException();
            } catch (ExpiredDateException e) {
                e.printStackTrace();
                System.out.println("Handled: Product manufactured in " + year + " is considered expired/too old.");
            }
        } else {
            System.out.println("Product is recently manufactured (" + year + ").");
        }
        return year;
    }
}
