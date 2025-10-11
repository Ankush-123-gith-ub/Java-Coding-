public interface SmartDevice {
    void turnOn();
    void turnOff();
}

class lights implements SmartDevice{
    public void turnOn(){
        System.out.println("Lights on");
    }
    public void turnOff(){
        System.out.println("Lights off");
    }
}
class AC implements SmartDevice{
    public void turnOn(){
        System.out.println("AC on");
    }
    public void turnOff(){
        System.out.println("AC off");
    }
}
class TV implements SmartDevice{
    public void turnOn(){
        System.out.println("TV on");
    }
    public void turnOff(){
        System.out.println("TV off");
    }
}

class devices{
    public static void main(String[] args) {
        SmartDevice light = new lights();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();
    
        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();

    }
}