package com.xworkz.healthcare.bridge;

import com.xworkz.healthcare.internal.*;

public interface BillingSystem {
    PatientInfo getPatientInfo(PatientInfo patientInfo);
    DoctorData getDoctorData(DoctorData doctorData);
    AppointmentDetails scheduleAppointment(AppointmentDetails appointmentDetails);
    BillingData getBillingData(BillingData billingData);
    PrescriptionInfo getPrescription(PrescriptionInfo prescriptionInfo);
}
