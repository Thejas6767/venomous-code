package com.xworkz.university.external;

import com.xworkz.university.dto.ProfessorDto;

public class ProfessorDtoRunner {
    public static void main(String[] args) {
        ProfessorDto professorDto=new ProfessorDto();

        professorDto.setProfessorName("Dr. Anya Sharma");
        String name=professorDto.getProfessorName();
        System.out.println("Professor Name: " + name);

        professorDto.setFacultyID(502);
        int id=professorDto.getFacultyID();
        System.out.println("Faculty ID: " + id);

        professorDto.setOfficeNumber(4567890123L);
        long number=professorDto.getOfficeNumber();
        System.out.println("Office Phone: " + number);

        professorDto.setTeachingExperience(15.5f);
        float experience=professorDto.getTeachingExperience();
        System.out.println("Teaching Experience: " + experience + " years");

        professorDto.setAnnualSalary(120000.00);
        double salary=professorDto.getAnnualSalary();
        System.out.println("Annual Salary: $" + salary);

        professorDto.setTenureStatus('T');
        char status=professorDto.getTenureStatus();
        System.out.println("Tenure Status: " + status + " (Tenured)");
    }
}
