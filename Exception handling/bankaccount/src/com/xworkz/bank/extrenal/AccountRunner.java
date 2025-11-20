package com.xworkz.bank.extrenal;

import com.xworkz.bank.internal.Account;

public class AccountRunner {
    public static void main(String[] args) {
        Account bankAccount = new Account();

        System.out.println("Testing Account Number ");
        bankAccount.checkAccount(1000);

        System.out.println("Testing Withdrawal ");
        bankAccount.withdraw(5000.00, 10000.00);

        System.out.println("Testing Account Status ");
        bankAccount.checkStatus("Frozen");

        System.out.println("Testing Transaction Limit");
        bankAccount.checkLimit(65000.00);

        System.out.println(" Testing Deposit ");
        bankAccount.deposit(-100.00);
    }
}
