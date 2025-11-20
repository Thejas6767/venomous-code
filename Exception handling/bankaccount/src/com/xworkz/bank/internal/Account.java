package com.xworkz.bank.internal;

import com.xworkz.bank.event.*;

public class Account {

    public int checkAccount(int accNumber) {
        if (accNumber == 1000) {
            try {
                throw new InvalidAccountNumberException();
            } catch (InvalidAccountNumberException e) {
                e.printStackTrace();
                System.out.println("Handled: Account number 1000 is reserved or does not exist.");
            }
        } else {
            System.out.println("Account number " + accNumber + " is valid.");
        }
        return accNumber;
    }


    public double withdraw(double balance, double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            try {
                throw new InsufficientFundsException();
            } catch (InsufficientFundsException e) {
                e.printStackTrace();
                System.out.println("Handled: Withdrawal amount exceeds the available balance.");
            }
        } else {
            double newBalance = balance - withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + newBalance);
            return newBalance;
        }
        return balance;
    }


    public String checkStatus(String status) {
        if (status.equals("Frozen")) {
            try {
                throw new AccountFrozenException();
            } catch (AccountFrozenException e) {
                e.printStackTrace();
                System.out.println("Handled: Account is frozen due to security concerns. No transactions allowed.");
            }
        } else {
            System.out.println("Account is active and ready for transactions.");
        }
        return status;
    }


    public double checkLimit(double amount) {
        if (amount > 50000.00) {
            try {
                throw new TransactionLimitExceededException();
            } catch (TransactionLimitExceededException e) {
                e.printStackTrace();
                System.out.println("Handled: Transaction amount exceeds the single transaction limit of 50,000.");
            }
        } else {
            System.out.println("Transaction amount (" + amount + ") is within the allowed limit.");
        }
        return amount;
    }


    public double deposit(double depositAmount) {
        if (depositAmount < 0) {
            try {
                throw new NegativeDepositException();
            } catch (NegativeDepositException e) {
                e.printStackTrace();
                System.out.println("Handled: Cannot deposit a negative amount.");
            }
        } else {
            System.out.println("Deposit of " + depositAmount + " successful.");
        }
        return depositAmount;
    }
}
