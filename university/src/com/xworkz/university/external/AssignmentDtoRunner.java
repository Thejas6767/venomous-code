package com.xworkz.university.external;

import com.xworkz.university.dto.AssignmentDto;

public class AssignmentDtoRunner {
    public static void main(String[] args) {
        AssignmentDto assignmentDto=new AssignmentDto();

        assignmentDto.setAssignmentTopic("Concurrency");
        String topic=assignmentDto.getAssignmentTopic();
        System.out.println("Assignment Topic: " + topic);

        assignmentDto.setMaxMarks(25);
        int marks=assignmentDto.getMaxMarks();
        System.out.println("Max Marks: " + marks);

        assignmentDto.setSubmissionTimestamp(1730000000L);
        long timestamp=assignmentDto.getSubmissionTimestamp();
        System.out.println("Submission Timestamp: " + timestamp);

        assignmentDto.setWeightagePercent(20.0f);
        float weightage=assignmentDto.getWeightagePercent();
        System.out.println("Weightage: " + weightage + "%");

        assignmentDto.setAvgScore(21.5);
        double score=assignmentDto.getAvgScore();
        System.out.println("Average Score: " + score);

        assignmentDto.setAssignmentType('P');
        char type=assignmentDto.getAssignmentType();
        System.out.println("Assignment Type: " + type + " (Project)");
    }
}
