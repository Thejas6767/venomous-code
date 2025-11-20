package com.xworkz.clinic.external;

import com.xworkz.clinic.internal.Trial;

public class TrialRunner {
    public static void main(String[] args) {
        Trial clinicalTrial = new Trial();

        System.out.println(" Testing Patient ID ");
        clinicalTrial.validatePatientId("A1234");

        System.out.println("Testing Age Eligibility ");
        clinicalTrial.checkAgeEligibility(70);

        System.out.println("Testing Consent Form");
        clinicalTrial.checkConsent(false);

        System.out.println("Testing Dosage ");
        clinicalTrial.administerDosage(25.0);

        System.out.println("Testing Trial Phase ");
        clinicalTrial.checkTrialPhase("Phase 2");
    }
}
