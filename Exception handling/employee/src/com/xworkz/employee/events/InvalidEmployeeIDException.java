package com.xworkz.employee.events;

public class InvalidEmployeeIDException extends Exception {
    public InvalidEmployeeIDException() {
        System.err.println("InvalidEmployeeIDException");
    }
}
