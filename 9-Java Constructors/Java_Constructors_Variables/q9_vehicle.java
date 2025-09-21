
public class q9_vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0;

    q9_vehicle(String o, String v) {
        ownerName = o; vehicleType = v;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        q9_vehicle v1 = new q9_vehicle("john81", "Car");
        q9_vehicle v2 = new q9_vehicle("alice52", "Truck");
        v1.displayVehicleDetails();
        q9_vehicle.updateRegistrationFee(150.0);
        v2.displayVehicleDetails();
    }
}
