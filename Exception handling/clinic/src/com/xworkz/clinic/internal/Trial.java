package com.xworkz.clinic.internal;

import com.xworkz.clinic.event.*;

public class Trial {

    public String validatePatientId(String patientId) {
        if (!patientId.startsWith("P")) {
            try {
                throw new InvalidPatientIDException();
            } catch (InvalidPatientIDException e) {
                e.printStackTrace();
                System.out.println("Handled: Patient ID must start with 'P'. Screening failed.");
            }
        } else {
            System.out.println("Patient ID " + patientId + " is correctly formatted.");
        }
        return patientId;
    }


    public int checkAgeEligibility(int age) {
        if (age < 18 || age > 65) {
            try {
                throw new IneligibleAgeException();
            } catch (IneligibleAgeException e) {
                e.printStackTrace();
                System.out.println("Handled: Patient age (" + age + ") is outside the eligible range (18-65).");
            }
        } else {
            System.out.println("Patient age (" + age + ") is eligible for the trial.");
        }
        return age;
    }


    public boolean checkConsent(boolean hasSigned) {
        if (!hasSigned) {
            try {
                throw new ConsentFormMissingException();
            } catch (ConsentFormMissingException e) {
                e.printStackTrace();
                System.out.println("Handled: Consent form missing. Patient cannot be enrolled.");
            }
        } else {
            System.out.println("Informed consent confirmed. Patient can proceed.");
        }
        return hasSigned;
    }


    public double administerDosage(double dosageMg) {
        if (dosageMg < 5.0 || dosageMg > 20.0) {
            try {
                throw new DosageOutOfRangeException();
            } catch (DosageOutOfRangeException e) {
                e.printStackTrace();
                System.out.println("Handled: Dosage (" + dosageMg + " mg) is outside the protocol range (5.0-20.0 mg).");
            }
        } else {
            System.out.println("Dosage (" + dosageMg + " mg) is within the safe limit.");
        }
        return dosageMg;
    }


    public String checkTrialPhase(String currentPhase) {
        if (!currentPhase.equals("Phase 3")) {
            try {
                throw new TrialPhaseMismatchException();
            } catch (TrialPhaseMismatchException e) {
                e.printStackTrace();
                System.out.println("Handled: Data processing expected for Phase 3, but received data from " + currentPhase + ".");
            }
        } else {
            System.out.println("Data matches the expected trial phase: " + currentPhase + ".");
        }
        return currentPhase;
    }
}
