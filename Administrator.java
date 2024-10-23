import java.util.*;

public class Administrator extends User {
    public Administrator(String id, String name) {
        super(id, name, "Administrator");
    }

    @Override
    public void displayMenu() {
        System.out.println("Administrator Menu:");
        System.out.println("1. Manage Hospital Staff");
        System.out.println("2. View Appointments Details");
        System.out.println("3. Manage Medication Inventory");
        System.out.println("4. Approve Replenishment Requests");
        System.out.println("5. Logout");
    }

    @Override
    public void handleMenu(Scanner scanner) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1 -> System.out.println("Managing hospital staff...");
                case 2 -> System.out.println("Viewing appointment details...");
                case 3 -> System.out.println("Managing medication inventory...");
                case 4 -> System.out.println("Approving replenishment requests...");
                case 5 -> System.out.println("Logging out...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
}
