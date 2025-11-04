package com.xworkz.university.dto;

public class DepartmentDto {
    private String departmentName;
    private int buildingFloor;
    private long totalBudget;
    private float avgFacultyRating;
    private double researchFunding;
    private char accreditationStatus;

    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public void setBuildingFloor(int buildingFloor){
        this.buildingFloor=buildingFloor;
    }
    public int getBuildingFloor(){
        return buildingFloor;
    }
    public void setTotalBudget(long totalBudget){
        this.totalBudget=totalBudget;
    }
    public long getTotalBudget(){
        return totalBudget;
    }
    public void setAvgFacultyRating(float avgFacultyRating){
        this.avgFacultyRating=avgFacultyRating;
    }
    public float getAvgFacultyRating(){
        return avgFacultyRating;
    }
    public void setResearchFunding(double researchFunding){
        this.researchFunding=researchFunding;
    }
    public double getResearchFunding(){
        return researchFunding;
    }
    public void setAccreditationStatus(char accreditationStatus){
        this.accreditationStatus=accreditationStatus;
    }
    public char getAccreditationStatus(){
        return accreditationStatus;
    }
}