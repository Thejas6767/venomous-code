package com.xworkz.university.external;

import com.xworkz.university.dto.StudentDto;

public class StudentDtoRunner {
    public static void main(String[] args) {
        StudentDto studentDto=new StudentDto();

        studentDto.setStudentName("Liam O'Connell");
        String name=studentDto.getStudentName();
        System.out.println("Student Name: " + name);

        studentDto.setStudentID(10056);
        int id=studentDto.getStudentID();
        System.out.println("Student ID: " + id);

        studentDto.setContactNumber(9988776655L);
        long number=studentDto.getContactNumber();
        System.out.println("Contact Number: " + number);

        studentDto.setGpa(3.85f);
        float gpa=studentDto.getGpa();
        System.out.println("GPA: " + gpa);

        studentDto.setFeeBalance(500.25);
        double balance=studentDto.getFeeBalance();
        System.out.println("Fee Balance: $" + balance);

        studentDto.setEnrollmentStatus('A');
        char status=studentDto.getEnrollmentStatus();
        System.out.println("Enrollment Status: " + status + " (Active)");
    }
}