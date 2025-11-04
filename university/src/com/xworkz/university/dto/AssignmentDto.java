package com.xworkz.university.dto;

public class AssignmentDto {
    private String assignmentTopic;
    private int maxMarks;
    private long submissionTimestamp;
    private float weightagePercent;
    private double avgScore;
    private char assignmentType;

    public void setAssignmentTopic(String assignmentTopic){
        this.assignmentTopic=assignmentTopic;
    }
    public String getAssignmentTopic(){
        return assignmentTopic;
    }
    public void setMaxMarks(int maxMarks){
        this.maxMarks=maxMarks;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public void setSubmissionTimestamp(long submissionTimestamp){
        this.submissionTimestamp=submissionTimestamp;
    }
    public long getSubmissionTimestamp(){
        return submissionTimestamp;
    }
    public void setWeightagePercent(float weightagePercent){
        this.weightagePercent=weightagePercent;
    }
    public float getWeightagePercent(){
        return weightagePercent;
    }
    public void setAvgScore(double avgScore){
        this.avgScore=avgScore;
    }
    public double getAvgScore(){
        return avgScore;
    }
    public void setAssignmentType(char assignmentType){
        this.assignmentType=assignmentType;
    }
    public char getAssignmentType(){
        return assignmentType;
    }
}
