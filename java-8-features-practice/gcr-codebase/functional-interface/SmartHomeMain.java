public class SmartHomeMain {

    public static void main(String[] args) {

        SmartDevice device1 = new Light();
        SmartDevice device2 = new Ac();

        device1.turnOn();
        device2.turnOff();
    }
}
