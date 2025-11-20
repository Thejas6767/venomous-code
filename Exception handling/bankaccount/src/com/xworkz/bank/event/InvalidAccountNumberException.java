package com.xworkz.bank.event;

public class InvalidAccountNumberException extends Exception {
    public InvalidAccountNumberException() {
        System.err.println("InvalidAccountNumberException ");
    }
}
