package com.xworkz.university.dto;

public class StudentDto {
    private String studentName;
    private int studentID;
    private long contactNumber;
    private float gpa;
    private double feeBalance;
    private char enrollmentStatus;

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentID(int studentID){
        this.studentID=studentID;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setGpa(float gpa){
        this.gpa=gpa;
    }
    public float getGpa(){
        return gpa;
    }
    public void setFeeBalance(double feeBalance){
        this.feeBalance=feeBalance;
    }
    public double getFeeBalance(){
        return feeBalance;
    }
    public void setEnrollmentStatus(char enrollmentStatus){
        this.enrollmentStatus=enrollmentStatus;
    }
    public char getEnrollmentStatus(){
        return enrollmentStatus;
    }
}
