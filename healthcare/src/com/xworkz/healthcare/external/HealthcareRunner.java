package com.xworkz.healthcare.external;

import com.xworkz.healthcare.bridge.*;
import com.xworkz.healthcare.internal.*;

public class HealthcareRunner {
    public static void main(String[] args) {
        PatientInfo patient = new PatientInfo("Emily Clark", 45);
        DoctorData doctor = new DoctorData(1092873, "Dr. A. Sharma");
        AppointmentDetails appointment = new AppointmentDetails("2025-11-15", "Routine Checkup");
        BillingData billing = new BillingData(250.75, "Blue Shield");
        PrescriptionInfo prescription = new PrescriptionInfo("Amoxicillin", 500);

        HospitalService hospitalService = new HospitalServiceImpl();
        System.out.println("\n--- Testing HospitalServiceImpl ---");
        hospitalService.PatientInfo(patient);
        hospitalService.DoctorData(doctor);
        hospitalService.scheduleAppointment(appointment);
        hospitalService.BillingData(billing);
        hospitalService.Prescription(prescription);
        System.out.println("---------------------------------");

        PatientAccess patientAccess = new PatientAccessImpl();
        System.out.println("\n--- Testing PatientAccessImpl ---");
        patientAccess.PatientInfo(patient);
        patientAccess.DoctorData(doctor);
        patientAccess.scheduleAppointment(appointment);
        patientAccess.BillingData(billing);
        patientAccess.Prescription(prescription);
        System.out.println("---------------------------------");

        DoctorAccess doctorAccess = new DoctorAccessImpl();
        System.out.println("\n--- Testing DoctorAccessImpl ---");
        doctorAccess.PatientInfo(patient);
        doctorAccess.DoctorData(doctor);
        doctorAccess.scheduleAppointment(appointment);
        doctorAccess.BillingData(billing);
        doctorAccess.Prescription(prescription);
        System.out.println("---------------------------------");

        AppointmentScheduler scheduler = new AppointmentSchedulerImpl();
        System.out.println("\n--- Testing AppointmentSchedulerImpl ---");
        scheduler.PatientInfo(patient);
        scheduler.DoctorData(doctor);
        scheduler.scheduleAppointment(appointment);
        scheduler.BillingData(billing);
        scheduler.Prescription(prescription);
        System.out.println("---------------------------------");

        BillingSystem billingSystem = new BillingSystemImpl();
        System.out.println("\n--- Testing BillingSystemImpl ---");
        billingSystem.PatientInfo(patient);
        billingSystem.DoctorData(doctor);
        billingSystem.scheduleAppointment(appointment);
        billingSystem.BillingData(billing);
        billingSystem.Prescription(prescription);
        System.out.println("---------------------------------");
    }
}