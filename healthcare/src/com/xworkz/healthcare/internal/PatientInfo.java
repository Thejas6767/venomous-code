package com.xworkz.healthcare.internal;

public class PatientInfo {
    public static String patientName;
    public static int age;

    public PatientInfo(String patientName, int age) {
        PatientInfo.patientName = patientName;
        PatientInfo.age = age;
    }
}