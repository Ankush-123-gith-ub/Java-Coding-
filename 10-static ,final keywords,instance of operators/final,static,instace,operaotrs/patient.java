
public class patient {
    private static String hospitalName;
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void setHospitalName(String name) { hospitalName = name; }
    public static int getTotalPatients() { return totalPatients; }

    public void displayPatientDetails() {
        if (this instanceof patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("The object is not an instance of the Patient class.");
        }
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAilment() { return ailment; }
    public String getPatientID() { return patientID; }

    public static void main(String[] args) {
        patient.setHospitalName("City Hospital");
        patient patient1 = new patient("Lathika", 30, "Flu", "P001");
        patient patient2 = new patient("Lidiya", 45, "Fracture", "P002");
        System.out.println("Total Patients Admitted: " + patient.getTotalPatients());
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
    }
}
