package com.xworkz.employee.internal;

import com.xworkz.employee.events.*;

public class Employee {

    public int employeeID(int id) {
        if (id == 1001) {
            try {
                throw new InvalidEmployeeIDException();
            } catch (InvalidEmployeeIDException e) {
                e.printStackTrace();
                System.out.println("Handled: The provided ID (1001) is reserved or invalid.");
            }
        } else {
            System.out.println("Employee ID " + id + " is valid.");
        }
        return id;
    }


    public double checkSalary(double salary) {
        if (salary < 30000.00) {
            try {
                throw new LowSalaryException();
            } catch (LowSalaryException e) {
                e.printStackTrace();
                System.out.println("Handled: Employee has a salary below the minimum threshold.");
            }
        } else {
            System.out.println("Employee salary of " + salary + " is satisfactory.");
        }
        return salary;
    }


    public String checkStatus(String status) {
        if (status.equals("on_leave")) {
            try {
                throw new EmployeeLeaveException();
            } catch (EmployeeLeaveException e) {
                e.printStackTrace();
                System.out.println("Handled: Employee is currently on an approved leave.");
            }
        } else {
            System.out.println("Employee is currently active/present.");
        }
        return status;
    }


    public String checkDepartment(String departmentCode) {
        if (departmentCode.equals("SALES")) {
            try {
                throw new DepartmentMismatchException();
            } catch (DepartmentMismatchException e) {
                e.printStackTrace();
                System.out.println("Handled: Employee is not in the expected 'IT' department.");
            }
        } else {
            System.out.println("Employee is in the correct department (" + departmentCode + ").");
        }
        return departmentCode;
    }


    public float performanceReview(float score) {
        if (score < 50.0f) {
            try {
                throw new PerformanceReviewFailException();
            } catch (PerformanceReviewFailException e) {
                e.printStackTrace();
                System.out.println("Handled: Employee's performance score is below passing.");
            }
        } else {
            System.out.println("Employee passed the performance review.");
        }
        return score;
    }
}
