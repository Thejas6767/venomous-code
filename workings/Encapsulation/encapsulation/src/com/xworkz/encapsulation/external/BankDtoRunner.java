package com.xworkz.encapsulation.external;


import com.xworkz.encapsulation.dto.BankDto;

public class BankDtoRunner {
    public static void main(String[] args) {

        BankDto acc1 = new BankDto("Rahul", 123456789L, 50000.50, true);
        BankDto acc2 = new BankDto("Sonia", 987654321L, 120000.75, false);
        BankDto acc3 = new BankDto("Rahul", 123456789L, 50000.50, true);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        if (acc1.equals(acc3)) {
            System.out.println("Account 1 and Account 3 contain identical information.");
        } else {
            System.out.println("These are different accounts.");
        }

        if (acc2.isSavings()) {
            System.out.println(acc2.getAccountHolder() + " has a Savings account.");
        } else {
            System.out.println(acc2.getAccountHolder() + " has a Current account.");
        }

        System.out.println("Hash of Acc 1: " + acc1.hashCode());
        System.out.println("Hash of Acc 3: " + acc3.hashCode());
    }
}