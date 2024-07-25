package healthcare_managment;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) throws Exception {
        // Create a new patient
        Patient patient = new Patient("P001", "John Doe", "john.doe@example.com", "password123", "1234567890", "123 Main St", LocalDateTime.now());
        patient.register();

        // Create a medical history for the patient
        MedicalHistory history = new MedicalHistory("Flu", "Rest and hydration", "Paracetamol", "O+", "Patient should rest for a week.", LocalDateTime.now());
        patient.setMedicalHistory(history);

        // Create a new doctor
        Doctor doctor = new Doctor("D001", "Dr. Smith", "dr.smith@example.com", "password123", "0987654321", "456 Elm St", LocalDateTime.now());
        doctor.register();

        // Create a schedule for the doctor
        Schedule schedule = new Schedule(patient, LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(1).plusHours(1), "Regular check-up.", LocalDateTime.now());
        doctor.addSchedule(schedule);

        // Admin instance
        Admin admin = new Admin("A001", "Admin User", "admin@example.com", "password123", "1122334455", "789 Oak St", LocalDateTime.now());
        admin.register();

        // Demonstrate functionality
        patient.login();
        patient.viewMedicalHistory();
        patient.bookAppointment();
        patient.manageProfile();
        patient.logout();

        doctor.login();
        doctor.viewPatientDetails();
        doctor.manageSchedule();
        doctor.updateMedicalHistory();
        doctor.logout();

        admin.login();
        admin.manageUsers();
        admin.logout();
    }
}
