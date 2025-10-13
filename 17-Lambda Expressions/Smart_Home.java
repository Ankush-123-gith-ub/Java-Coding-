interface Smart_Home{
    void activate();
}
class Smart_Light{
    public static void main(String[] args) {
        Smart_Home lightmotion = () -> System.out.println("Motion Detected:- Turning on Lights.");
        Smart_Home lightnight = () -> System.out.println("Night Detected:- Turning on Lights.");
        Smart_Home lightvoice = () -> System.out.println("Voice Detected:- Turning on Lights.");
        lightmotion.activate();
        lightnight.activate();
        lightvoice.activate();
    }
}