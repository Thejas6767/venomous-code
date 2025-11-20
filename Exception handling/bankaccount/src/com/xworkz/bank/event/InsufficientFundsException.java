package com.xworkz.bank.event;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        System.err.println("InsufficientFundsException ");
    }
}
