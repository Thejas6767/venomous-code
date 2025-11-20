package com.xworkz.employee.events;

public class DepartmentMismatchException extends Exception {
    public DepartmentMismatchException() {
        System.err.println("DepartmentMismatchException ");
    }
}