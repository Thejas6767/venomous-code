package com.xworkz.healthcare.bridge;

import com.xworkz.healthcare.internal.*;

public interface HospitalService {
    PatientInfo PatientInfo(PatientInfo patientInfo);
    DoctorData DoctorData(DoctorData doctorData);

    PatientInfo getPatientInfo(PatientInfo patientInfo);

    DoctorData getDoctorData(DoctorData doctorData);

    AppointmentDetails scheduleAppointment(AppointmentDetails appointmentDetails); // Kept 'schedule'

    BillingData getBillingData(BillingData billingData);

    PrescriptionInfo getPrescription(PrescriptionInfo prescriptionInfo);

    BillingData BillingData(BillingData billingData);
    PrescriptionInfo Prescription(PrescriptionInfo prescriptionInfo); // Renamed to 'Prescription'
}
