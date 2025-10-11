public interface MultiVechile {
    void rent();
    void returnvechile();
}

class Cars implements MultiVechile{
    public void rent(){
        System.out.println("Car rented.");
    }
    public void returnvechile(){
        System.out.println("Car returned");
    }
}
class Bikes implements MultiVechile{
    public void rent(){
        System.out.println("Bike rented.");
    }
    public void returnvechile(){
        System.out.println("Bike returned");
    }
}
class Buses implements MultiVechile{
    public void rent(){
        System.out.println("Bus rented.");
    }
    public void returnvechile(){
        System.out.println("Bus returned");
    }
}


class vechiles{
    public static void main(String[] args) {
        MultiVechile car = new Cars();
        MultiVechile bike = new Bikes();
        MultiVechile bus = new Buses();
    
        car.rent();
        bike.rent();
        bus.rent();

        car.returnvechile();
        bike.returnvechile();
        bus.returnvechile();

    }
}