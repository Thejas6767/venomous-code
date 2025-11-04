package com.xworkz.university.dto;

public class CourseDto {
    private String courseName;
    private int courseCode;
    private long prerequisiteID;
    private float credits;
    private double tuitionFee;
    private char courseLevel;

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseCode(int courseCode){
        this.courseCode=courseCode;
    }
    public int getCourseCode(){
        return courseCode;
    }
    public void setPrerequisiteID(long prerequisiteID){
        this.prerequisiteID=prerequisiteID;
    }
    public long getPrerequisiteID(){
        return prerequisiteID;
    }
    public void setCredits(float credits){
        this.credits=credits;
    }
    public float getCredits(){
        return credits;
    }
    public void setTuitionFee(double tuitionFee){
        this.tuitionFee=tuitionFee;
    }
    public double getTuitionFee(){
        return tuitionFee;
    }
    public void setCourseLevel(char courseLevel){
        this.courseLevel=courseLevel;
    }
    public char getCourseLevel(){
        return courseLevel;
    }
}