package com.xworkz.encapsulation.dto;


import java.util.Objects;

public class BankDto {
    private String accountHolder;
    private long accountNumber;
    private double balance;
    private boolean isSavings;

    public BankDto(String accountHolder, long accountNumber, double balance, boolean isSavings) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isSavings = isSavings;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isSavings() {
        return isSavings;
    }

    public void setSavings(boolean savings) {
        isSavings = savings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankDto)) return false;
        BankDto bankDto = (BankDto) o;
        return accountNumber == bankDto.accountNumber &&
                Double.compare(bankDto.balance, balance) == 0 &&
                isSavings == bankDto.isSavings &&
                Objects.equals(accountHolder, bankDto.accountHolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountHolder, accountNumber, balance, isSavings);
    }

    @Override
    public String toString() {
        return "BankDto{" +
                "holder='" + accountHolder + '\'' +
                ", accNo=" + accountNumber +
                ", balance=" + balance +
                ", isSavings=" + isSavings +
                '}';
    }
}
