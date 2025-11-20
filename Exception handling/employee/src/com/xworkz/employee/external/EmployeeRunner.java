package com.xworkz.employee.external;

import com.xworkz.employee.internal.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println("Testing Employee ID Invalid Case");
        employee.employeeID(1001);

        System.out.println("Testing Salary ");
        employee.checkSalary(25000.00);

        System.out.println("Testing Status ");
        employee.checkStatus("on_leave");

        System.out.println(" Testing Department");
        employee.checkDepartment("SALES");

        System.out.println("Testing Performance");
        employee.performanceReview(45.5f);
    }
}
