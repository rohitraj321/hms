import java.util.*;

public class Doctor extends User {
    private List<Appointment> appointments = new ArrayList<>();

    public Doctor(String id, String name) {
        super(id, name, "Doctor");
    }

    @Override
    public void displayMenu() {
        System.out.println("Doctor Menu:");
        System.out.println("1. View Patient Records");
        System.out.println("2. Update Patient Records");
        System.out.println("3. View Personal Schedule");
        System.out.println("4. Set Appointment Availability");
        System.out.println("5. Accept or Decline Appointment Requests");
        System.out.println("6. View Upcoming Appointments");
        System.out.println("7. Record Appointment Outcome");
        System.out.println("8. Logout");
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
                case 1 -> System.out.println("Viewing patient records...");
                case 2 -> System.out.println("Updating patient records...");
                case 3 -> System.out.println("Viewing personal schedule...");
                case 4 -> System.out.println("Setting availability...");
                case 5 -> System.out.println("Accepting/Declining requests...");
                case 6 -> System.out.println("Viewing upcoming appointments...");
                case 7 -> System.out.println("Recording appointment outcome...");
                case 8 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 8);
    }
}
