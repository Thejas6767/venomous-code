package com.xworkz.bank.event;

public class AccountFrozenException extends Exception {
    public AccountFrozenException() {
        System.err.println("AccountFrozenException ");
    }
}
