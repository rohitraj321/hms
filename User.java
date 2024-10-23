import java.util.*;
public abstract class User {
    protected String id;
    protected String name;
    protected String role;
    protected String password;

    public User(String id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.password = "password";  // Default password
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }

    // Validate login credentials
    public boolean validateLogin(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // Change password
    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password updated successfully.");
    }

    public abstract void displayMenu();
    public abstract void handleMenu(Scanner scanner);
}
