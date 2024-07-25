package healthcare_managment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Patient extends User {
    private MedicalHistory medicalHistory;
    private static List<Patient> patients = new ArrayList<>();

    public Patient(String id, String name, String email, String password, String phone, String address, LocalDateTime createdAt) {
        super(id, name, email, password, phone, address, createdAt);
    }

    public void viewMedicalHistory() {
        if (medicalHistory != null) {
            System.out.println("Viewing medical history for " + name);
            System.out.println("Diagnosis: " + medicalHistory.getDiagnosis());
            System.out.println("Treatment: " + medicalHistory.getTreatment());
            System.out.println("Prescription: " + medicalHistory.getPrescription());
            System.out.println("Blood Type: " + medicalHistory.getBloodType());
            System.out.println("Note: " + medicalHistory.getNote());
            System.out.println("Created At: " + medicalHistory.getCreatedAt());
        } else {
            System.out.println("No medical history available for " + name);
        }
    }

    public void bookAppointment() {
        // Dummy book appointment functionality
        System.out.println(name + " booked an appointment.");
    }

    public void manageProfile() {
        // Dummy manage profile functionality
        System.out.println(name + " managed their profile.");
    }

    @Override
    public void register() {
        super.register();
        patients.add(this);
    }

    public void setMedicalHistory(MedicalHistory medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public static List<Patient> getPatients() {
        return patients;
    }
}
