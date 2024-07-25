package healthcare_managment;

import java.time.LocalDateTime;

public class MedicalHistory {
    private String diagnosis;
    private String treatment;
    private String prescription;
    private String bloodType;
    private String note;
    private LocalDateTime createdAt;

    public MedicalHistory(String diagnosis, String treatment, String prescription, String bloodType, String note, LocalDateTime createdAt) {
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.prescription = prescription;
        this.bloodType = bloodType;
        this.note = note;
        this.createdAt = createdAt;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getPrescription() {
        return prescription;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getNote() {
        return note;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
