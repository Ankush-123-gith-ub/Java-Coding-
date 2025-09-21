
interface Refuelable { void refuel(); }

class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int ms, String m) { maxSpeed = ms; model = m; }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int ms, String m) { super(ms, m); }
    void charge() { System.out.println("Charging electric vehicle"); }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int ms, String m) { super(ms, m); }
    public void refuel() { System.out.println("Refueling petrol vehicle"); }
}

public class electricvehicleMain {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda");
        ev.charge();
        pv.refuel();
    }
}
