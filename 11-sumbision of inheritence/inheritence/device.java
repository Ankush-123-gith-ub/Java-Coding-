
class Device {
    String deviceId, status;
    Device(String id, String st) { deviceId = id; status = st; }
    void displayStatus() { System.out.println("Device:" + deviceId + ", Status:" + status); }
}

class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(String id, String st, int temp) { super(id, st); temperatureSetting = temp; }
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temp Set:" + temperatureSetting);
    }
}

public class deviceMain {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("alice23", "On", 22);
        t.displayStatus();
    }
}
