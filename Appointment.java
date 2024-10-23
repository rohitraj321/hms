public class Appointment {
    private String patientId;
    private String doctorId;
    private String date;

    public Appointment(String patientId, String doctorId, String date) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Appointment with Doctor %s on %s", doctorId, date);
    }
}
