package com.xworkz.university.external;

import com.xworkz.university.dto.CourseDto;

public class CourseDtoRunner {
    public static void main(String[] args) {
        CourseDto courseDto=new CourseDto();

        courseDto.setCourseName("Data Structures");
        String name=courseDto.getCourseName();
        System.out.println("Course Name: " + name);

        courseDto.setCourseCode(401);
        int code=courseDto.getCourseCode();
        System.out.println("Course Code: " + code);

        courseDto.setPrerequisiteID(876543210L);
        long prereqId=courseDto.getPrerequisiteID();
        System.out.println("Prerequisite ID: " + prereqId);

        courseDto.setCredits(4.0f);
        float credits=courseDto.getCredits();
        System.out.println("Course Credits: " + credits);

        courseDto.setTuitionFee(1250.75);
        double fee=courseDto.getTuitionFee();
        System.out.println("Tuition Fee: $" + fee);

        courseDto.setCourseLevel('U');
        char level=courseDto.getCourseLevel();
        System.out.println("Course Level: " + level + " (Undergraduate)");
    }
}
