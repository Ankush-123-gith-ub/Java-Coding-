
class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int ms, String ft) { maxSpeed = ms; fuelType = ft; }
    void displayInfo() {
        System.out.println("Speed:" + maxSpeed + " Fuel:" + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
    Car(int ms, String ft, int sc) { super(ms, ft); seatCapacity = sc; }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats:" + seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;
    Truck(int ms, String ft, double lc) { super(ms, ft); loadCapacity = lc; }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load:" + loadCapacity);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;
    Motorcycle(int ms, String ft, boolean sc) { super(ms, ft); hasSidecar = sc; }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Sidecar:" + hasSidecar);
    }
}

public class vehicleMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(120, "Petrol", 4);
        vehicles[1] = new Truck(100, "Diesel", 2000.5);
        vehicles[2] = new Motorcycle(90, "Petrol", true);
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
