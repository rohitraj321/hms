import java.util.*;

public class HospitalSystem {
    private Map<String, User> users = new HashMap<>();

    // Add users to the system
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    // Main entry to the login system where user first selects their role
    public void start(Scanner scanner) {
        System.out.println("Welcome to the Hospital Management System");
        System.out.println("Please select your role:");
        System.out.println("1. Patient");
        System.out.println("2. Doctor");
        System.out.println("3. Pharmacist");
        System.out.println("4. Administrator");

        System.out.print("Enter your choice: ");
        int roleChoice = scanner.nextInt();
        scanner.nextLine();  // Clear the input buffer

        String role = switch (roleChoice) {
            case 1 -> "Patient";
            case 2 -> "Doctor";
            case 3 -> "Pharmacist";
            case 4 -> "Administrator";
            default -> {
                System.out.println("Invalid choice. Exiting...");
                yield null;
            }
        };

        if (role != null) {
            login(scanner, role);
        }
    }

    // Login function based on selected role
    public void login(Scanner scanner, String role) {
        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        User user = users.get(id);
        if (user != null && user.getRole().equals(role) && user.validateLogin(password)) {
            System.out.println("Login successful! Welcome, " + user.getName());
            user.handleMenu(scanner);
        } else {
            System.out.println("Invalid credentials or role mismatch. Please try again.");
        }
    }

    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();

        // Adding sample users for each role
        system.addUser(new Patient("P001", "John Doe", "john@example.com"));
        system.addUser(new Doctor("D001", "Dr. Smith"));
        system.addUser(new Pharmacist("PH001", "Alice"));
        system.addUser(new Administrator("A001", "Admin"));

        Scanner scanner = new Scanner(System.in);
        system.start(scanner);
        scanner.close();
    }
}
