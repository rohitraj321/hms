import java.util.*;

public class Patient extends User {
    private String contactInfo;
    private List<Appointment> appointments = new ArrayList<>();

    public Patient(String id, String name, String contactInfo) {
        super(id, name, "Patient");
        this.contactInfo = contactInfo;
    }

    @Override
    public void displayMenu() {
        System.out.println("Patient Menu:");
        System.out.println("1. View Medical Record");
        System.out.println("2. Update Personal Information");
        System.out.println("3. View Available Appointment Slots");
        System.out.println("4. Schedule an Appointment");
        System.out.println("5. Reschedule an Appointment");
        System.out.println("6. Cancel an Appointment");
        System.out.println("7. View Scheduled Appointments");
        System.out.println("8. View Past Appointment Outcome Records");
        System.out.println("9. Logout");
    }

    @Override
    public void handleMenu(Scanner scanner) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Clear input buffer

            switch (choice) {
                case 1 -> viewMedicalRecord();
                case 2 -> updatePersonalInfo(scanner);
                case 3 -> viewAvailableSlots();
                case 4 -> scheduleAppointment(scanner);
                case 5 -> rescheduleAppointment(scanner);
                case 6 -> cancelAppointment(scanner);
                case 7 -> viewScheduledAppointments();
                case 8 -> viewPastRecords();
                case 9 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);
    }

    private void viewMedicalRecord() {
        System.out.println("Displaying medical record for " + name);
        // Add logic to show record details
    }

    private void updatePersonalInfo(Scanner scanner) {
        System.out.print("Enter new contact info: ");
        contactInfo = scanner.nextLine();
        System.out.println("Personal information updated.");
    }

    private void viewAvailableSlots() {
        System.out.println("Showing available appointment slots...");
    }

    private void scheduleAppointment(Scanner scanner) {
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();
        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        appointments.add(new Appointment(id, doctorId, date));
        System.out.println("Appointment scheduled.");
    }

    private void rescheduleAppointment(Scanner scanner) {
        System.out.println("Rescheduling an appointment...");
    }

    private void cancelAppointment(Scanner scanner) {
        System.out.println("Appointment cancelled.");
    }

    private void viewScheduledAppointments() {
        System.out.println("Scheduled appointments:");
        appointments.forEach(System.out::println);
    }

    private void viewPastRecords() {
        System.out.println("Viewing past appointment outcome records...");
    }
}
