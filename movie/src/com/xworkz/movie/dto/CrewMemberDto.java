package com.xworkz.movie.dto;

import java.util.Objects;

public class CrewMemberDto {

    private int memberID;
    private long salaryPerDay;
    private boolean unionMember;
    private char departmentCode;
    private double dailyOvertimeRate;
    private float experienceYears;

    private String name;
    private String role;
    private Integer totalProjects;
    private Long contactPhone;
    private Double healthCoveragePercentage;
    private Float workingHours;
    private Boolean hasSecurityClearance;

    public void setMemberID(int memberID) { this.memberID = memberID; }
    public void setSalaryPerDay(long salaryPerDay) { this.salaryPerDay = salaryPerDay; }
    public void setUnionMember(boolean unionMember) { this.unionMember = unionMember; }
    public void setDepartmentCode(char departmentCode) { this.departmentCode = departmentCode; }
    public void setDailyOvertimeRate(double dailyOvertimeRate) { this.dailyOvertimeRate = dailyOvertimeRate; }
    public void setExperienceYears(float experienceYears) { this.experienceYears = experienceYears; }
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }
    public void setTotalProjects(Integer totalProjects) { this.totalProjects = totalProjects; }
    public void setContactPhone(Long contactPhone) { this.contactPhone = contactPhone; }
    public void setHealthCoveragePercentage(Double healthCoveragePercentage) { this.healthCoveragePercentage = healthCoveragePercentage; }
    public void setWorkingHours(Float workingHours) { this.workingHours = workingHours; }
    public void setHasSecurityClearance(Boolean hasSecurityClearance) { this.hasSecurityClearance = hasSecurityClearance; }

    public int getMemberID() { return memberID; }
    public long getSalaryPerDay() { return salaryPerDay; }
    public boolean isUnionMember() { return unionMember; }
    public char getDepartmentCode() { return departmentCode; }
    public double getDailyOvertimeRate() { return dailyOvertimeRate; }
    public float getExperienceYears() { return experienceYears; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public Integer getTotalProjects() { return totalProjects; }
    public Long getContactPhone() { return contactPhone; }
    public Double getHealthCoveragePercentage() { return healthCoveragePercentage; }
    public Float getWorkingHours() { return workingHours; }
    public Boolean getHasSecurityClearance() { return hasSecurityClearance; }

    @Override
    public int hashCode() {
        return Objects.hash(memberID, salaryPerDay, unionMember, departmentCode, dailyOvertimeRate, experienceYears,
                name, role, totalProjects, contactPhone, healthCoveragePercentage, workingHours, hasSecurityClearance);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CrewMemberDto)) return false;
        CrewMemberDto other = (CrewMemberDto) obj;
        return memberID == other.memberID && salaryPerDay == other.salaryPerDay && unionMember == other.unionMember &&
                departmentCode == other.departmentCode && Double.compare(other.dailyOvertimeRate, dailyOvertimeRate) == 0 &&
                Float.compare(other.experienceYears, experienceYears) == 0 && Objects.equals(name, other.name) &&
                Objects.equals(role, other.role) && Objects.equals(totalProjects, other.totalProjects) &&
                Objects.equals(contactPhone, other.contactPhone) && Objects.equals(healthCoveragePercentage, other.healthCoveragePercentage) &&
                Objects.equals(workingHours, other.workingHours) && Objects.equals(hasSecurityClearance, other.hasSecurityClearance);
    }

    @Override
    public String toString() {
        return "CrewMemberDto { memberID=" + memberID + ", salaryPerDay=" + salaryPerDay + ", unionMember=" + unionMember + ", departmentCode=" + departmentCode + ", dailyOvertimeRate=" + dailyOvertimeRate + ", experienceYears=" + experienceYears + ", name='" + name + "', role='" + role + "', totalProjects=" + totalProjects + ", contactPhone=" + contactPhone + ", healthCoveragePercentage=" + healthCoveragePercentage + ", workingHours=" + workingHours + ", hasSecurityClearance=" + hasSecurityClearance + "}";
    }
}
