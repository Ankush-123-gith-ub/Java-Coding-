
import java.util.ArrayList;
class Patient {
    String name;
    Patient(String n) { name = n; }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();
    Doctor(String n) { name = n; }
    void consult(Patient p) {
        System.out.println(name + " consulting " + p.name);
        patients.add(p);
    }
}

class Hospital {
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }

    void showConsultations() {
        for(Doctor d : doctors) {
            for(Patient p : d.patients) {
                System.out.println(d.name + " consulted " + p.name);
            }
        }
    }
}

public class hospitalMain {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        Doctor d1 = new Doctor("Dr. " + "sam10");
        Doctor d2 = new Doctor("Dr. " + "alice87");
        Patient p1 = new Patient("emma64");
        Patient p2 = new Patient("john42");
        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        h.showConsultations();
    }
}
