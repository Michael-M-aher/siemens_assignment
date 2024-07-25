package healthcare_managment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
    private List<Schedule> schedules = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();

    public Doctor(String id, String name, String email, String password, String phone, String address, LocalDateTime createdAt) {
        super(id, name, email, password, phone, address, createdAt);
    }

    public void viewPatientDetails() {
        System.out.println("Viewing patient details.");
    }

    public void manageSchedule() {
        System.out.println("Managing schedule.");
        for (Schedule schedule : schedules) {
            System.out.println("Patient: " + schedule.getPatient().name);
            System.out.println("Start Time: " + schedule.getStartTime());
            System.out.println("End Time: " + schedule.getEndTime());
            System.out.println("Note: " + schedule.getNote());
        }
    }

    public void updateMedicalHistory() {
        System.out.println("Updating medical history.");
    }

    @Override
    public void register() {
        super.register();
        doctors.add(this);
    }

    public void addSchedule(Schedule schedule) {
        this.schedules.add(schedule);
    }

    public static List<Doctor> getDoctors() {
        return doctors;
    }
}
