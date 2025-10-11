interface Vehicle {
    void showSpeed();
    default void showBattery() {
        System.out.println("Battery info not available");
    }
}

class ElectricCar implements Vehicle {
    public void showSpeed() {
        System.out.println("Speed: 80 km/h");
    }
    public void showBattery() {
        System.out.println("Battery: 75%");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar();
        v.showSpeed();
        v.showBattery();
    }
}