package com.xworkz.healthcare.internal;

public class PrescriptionInfo {
    public static String medication;
    public static int dosageMG;

    public PrescriptionInfo(String medication, int dosageMG) {
        PrescriptionInfo.medication = medication;
        PrescriptionInfo.dosageMG = dosageMG;
    }
}
