package com.xworkz.bank.event;

public class NegativeDepositException extends Exception {
    public NegativeDepositException() {
        System.err.println("NegativeDepositException ");
    }
}
