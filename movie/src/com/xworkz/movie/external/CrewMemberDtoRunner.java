package com.xworkz.movie.external;


import com.xworkz.movie.dto.CrewMemberDto;

public class CrewMemberDtoRunner {
    public static void main(String[] args) {
        CrewMemberDto crew1 = new CrewMemberDto();
        crew1.setMemberID(501);
        crew1.setSalaryPerDay(2000L);
        crew1.setUnionMember(true);
        crew1.setDepartmentCode('L');
        crew1.setDailyOvertimeRate(1.5);
        crew1.setExperienceYears(10.5f);
        crew1.setName("Robert Lighting");
        crew1.setRole("Gaffer");
        crew1.setTotalProjects(50);
        crew1.setContactPhone(9988776655L);
        crew1.setHealthCoveragePercentage(0.9);
        crew1.setWorkingHours(10.0f);
        crew1.setHasSecurityClearance(true);

        System.out.println("---- CREW MEMBER DETAILS ----");
        System.out.println(crew1);
    }
}
