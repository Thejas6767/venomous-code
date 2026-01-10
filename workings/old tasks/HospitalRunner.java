class HospitalRunner {
    public static void main(String[] args) {
        
        int[] ids = {201, 202, 203, 204, 205};
        int[] patients = Hospital.patientIds(ids);
        for (int id : patients) {
            System.out.println("Patient ID = " + id);
        }
        System.out.println(" ");

        double[] bills = {2500.50, 7800.75, 4500.0, 12500.25, 9999.99};
        double[] hospitalBills = Hospital.bills(bills);
        for (double bill : hospitalBills) {
            System.out.println("Bill Amount = ₹" + bill);
        }
        System.out.println(" ");

        float[] medicines = {150.5f, 200.0f, 75.25f, 300.0f, 120.99f};
        float[] medCosts = Hospital.medicineCosts(medicines);
        for (float med : medCosts) {
            System.out.println("Medicine Cost = ₹" + med);
        }
        System.out.println(" ");

        char[] wards = {'A', 'B', 'C', 'D', 'E'};
        char[] wardTypes = Hospital.wardTypes(wards);
        for (char ward : wardTypes) {
            System.out.println("Ward Type = " + ward);
        }
        System.out.println(" ");

        boolean[] admitted = {true, false, true, true, false};
        boolean[] admittedPatients = Hospital.admittedStatus(admitted);
        for (boolean admit : admittedPatients) {
            System.out.println("Admitted = " + admit);
        }
        System.out.println(" ");

        long[] contacts = {9876543210L, 8765432109L, 7654321098L, 6543210987L, 9123456780L};
        long[] patientContacts = Hospital.contactNumbers(contacts);
        for (long cont : patientContacts) {
            System.out.println("Patient Contact = " + cont);
        }
        System.out.println(" ");

        String[] doctors = {"Dr. Arjun", "Dr. Meera", "Dr. Rahul", "Dr. Sneha", "Dr. Vikram"};
        String[] doctorList = Hospital.doctorNames(doctors);
        for (String doc : doctorList) {
            System.out.println("Doctor Name = " + doc);
        }
    }
}
