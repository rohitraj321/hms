import java.io.*;
import java.util.*;

public class CSVHandler {
    private static final String APPOINTMENTS_FILE = "appointments.csv";

    public static void saveAppointment(Appointment appointment) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(APPOINTMENTS_FILE, true))) {
            writer.write(appointment.toString() + "\n");
        }
    }

    public static List<String> loadAppointments() throws IOException {
        List<String> appointments = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(APPOINTMENTS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                appointments.add(line);
            }
        }
        return appointments;
    }
}
