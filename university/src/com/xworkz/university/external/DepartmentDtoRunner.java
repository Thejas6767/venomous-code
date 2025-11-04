package com.xworkz.university.external;

import com.xworkz.university.dto.DepartmentDto;

public class DepartmentDtoRunner {
    public static void main(String[] args) {
        DepartmentDto deptDto=new DepartmentDto();

        deptDto.setDepartmentName("Computer Science");
        String name=deptDto.getDepartmentName();
        System.out.println("Department Name: " + name);

        deptDto.setBuildingFloor(3);
        int floor=deptDto.getBuildingFloor();
        System.out.println("Building Floor: " + floor);

        deptDto.setTotalBudget(5000000L);
        long budget=deptDto.getTotalBudget();
        System.out.println("Total Budget: $" + budget);

        deptDto.setAvgFacultyRating(4.6f);
        float rating=deptDto.getAvgFacultyRating();
        System.out.println("Avg Faculty Rating: " + rating);

        deptDto.setResearchFunding(850000.50);
        double funding=deptDto.getResearchFunding();
        System.out.println("Research Funding: $" + funding);

        deptDto.setAccreditationStatus('A');
        char status=deptDto.getAccreditationStatus();
        System.out.println("Accreditation Status: " + status + " (Accredited)");
    }
}
