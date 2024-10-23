import java.util.*;

public class Pharmacist extends User {
    private Map<String, Integer> medicationInventory = new HashMap<>();

    public Pharmacist(String id, String name) {
        super(id, name, "Pharmacist");
    }

    @Override
    public void displayMenu() {
        System.out.println("Pharmacist Menu:");
        System.out.println("1. View Appointment Outcome Record");
        System.out.println("2. Update Prescription Status");
        System.out.println("3. View Medication Inventory");
        System.out.println("4. Submit Replenishment Request");
        System.out.println("5. Logout");
    }

    @Override
    public void handleMenu(Scanner scanner) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (choice) {
                case 1 -> viewAppointmentOutcome();
                case 2 -> updatePrescriptionStatus(scanner);
                case 3 -> viewInventory();
                case 4 -> submitReplenishmentRequest(scanner);
                case 5 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    private void viewAppointmentOutcome() {
        System.out.println("Viewing appointment outcome record...");
        // Logic to fetch and display outcome records
    }

    private void updatePrescriptionStatus(Scanner scanner) {
        System.out.print("Enter prescription ID: ");
        String prescriptionId = scanner.nextLine();
        System.out.print("Enter new status (pending/dispensed): ");
        String status = scanner.nextLine();
        System.out.println("Prescription " + prescriptionId + " updated to " + status + ".");
    }

    private void viewInventory() {
        System.out.println("Medication Inventory:");
        medicationInventory.forEach((med, qty) -> System.out.println(med + ": " + qty + " units"));
    }

    private void submitReplenishmentRequest(Scanner scanner) {
        System.out.print("Enter medication name: ");
        String medication = scanner.nextLine();
        System.out.print("Enter quantity to request: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.println("Replenishment request submitted for " + quantity + " units of " + medication + ".");
    }
}
