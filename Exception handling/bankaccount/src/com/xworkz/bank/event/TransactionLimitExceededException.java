package com.xworkz.bank.event;

public class TransactionLimitExceededException extends Exception {
    public TransactionLimitExceededException() {
        System.err.println("TransactionLimitExceededException ");
    }
}
