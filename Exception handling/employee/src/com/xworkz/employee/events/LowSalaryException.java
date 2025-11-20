package com.xworkz.employee.events;

public class LowSalaryException extends Exception {
    public LowSalaryException() {
        System.err.println("LowSalaryException ");
    }
}
