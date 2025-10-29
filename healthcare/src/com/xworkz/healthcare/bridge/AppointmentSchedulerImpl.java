package com.xworkz.healthcare.bridge;

import com.xworkz.healthcare.internal.*;

public class AppointmentSchedulerImpl implements AppointmentScheduler {
    @Override
    public PatientInfo getPatientInfo(PatientInfo patientInfo) {
        System.out.println("this is 1st sub class - Patient: " + PatientInfo.patientName + ", Age: " + PatientInfo.age);
        return patientInfo;
    }
    @Override
    public DoctorData getDoctorData(DoctorData doctorData) {
        System.out.println("this is 2nd sub class - Doctor ID: " + DoctorData.doctorID + ", Name: " + DoctorData.doctorName);
        return doctorData;
    }
    @Override
    public AppointmentDetails scheduleAppointment(AppointmentDetails appointmentDetails) {
        System.out.println("this is 3rd sub class - Date: " + AppointmentDetails.date + ", Reason: " + AppointmentDetails.reason);
        return appointmentDetails;
    }
    @Override
    public BillingData getBillingData(BillingData billingData) {
        System.out.println("this is 4th sub class - Cost: $" + BillingData.totalCost + ", Insurance: " + BillingData.insuranceProvider);
        return billingData;
    }
    @Override
    public PrescriptionInfo getPrescription(PrescriptionInfo prescriptionInfo) {
        System.out.println("this is 5th sub class - Medication: " + PrescriptionInfo.medication + ", Dosage: " + PrescriptionInfo.dosageMG + "mg");
        return prescriptionInfo;
    }
}
