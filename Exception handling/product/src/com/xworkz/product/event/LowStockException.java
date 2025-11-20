package com.xworkz.product.event;

public class LowStockException extends Exception {
    public LowStockException() {
        System.err.println("LowStockException ");
    }
}
