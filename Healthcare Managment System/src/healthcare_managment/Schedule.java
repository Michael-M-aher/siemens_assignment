package healthcare_managment;

import java.time.LocalDateTime;

public class Schedule {
    private Patient patient;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String note;
    private LocalDateTime createdAt;

    public Schedule(Patient patient, LocalDateTime startTime, LocalDateTime endTime, String note, LocalDateTime createdAt) {
        this.patient = patient;
        this.startTime = startTime;
        this.endTime = endTime;
        this.note = note;
        this.createdAt = createdAt;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getNote() {
        return note;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
