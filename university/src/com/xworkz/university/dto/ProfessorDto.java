package com.xworkz.university.dto;

public class ProfessorDto {
    private String professorName;
    private int facultyID;
    private long officeNumber;
    private float teachingExperience;
    private double annualSalary;
    private char tenureStatus;

    public void setProfessorName(String professorName){
        this.professorName=professorName;
    }
    public String getProfessorName(){
        return professorName;
    }
    public void setFacultyID(int facultyID){
        this.facultyID=facultyID;
    }
    public int getFacultyID(){
        return facultyID;
    }
    public void setOfficeNumber(long officeNumber){
        this.officeNumber=officeNumber;
    }
    public long getOfficeNumber(){
        return officeNumber;
    }
    public void setTeachingExperience(float teachingExperience){
        this.teachingExperience=teachingExperience;
    }
    public float getTeachingExperience(){
        return teachingExperience;
    }
    public void setAnnualSalary(double annualSalary){
        this.annualSalary=annualSalary;
    }
    public double getAnnualSalary(){
        return annualSalary;
    }
    public void setTenureStatus(char tenureStatus){
        this.tenureStatus=tenureStatus;
    }
    public char getTenureStatus(){
        return tenureStatus;
    }
}
