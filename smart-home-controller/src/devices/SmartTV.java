package devices;

public class SmartTV implements SmartDevice, Adjustable {
    private int volume;

    public SmartTV() {
        this.volume = 8;
    }

    @Override
    public void turnOn() {
        System.out.println("SmartTV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTV is OFF");
    }

    @Override
    public void increase() {
        volume++;
        System.out.println("Increased volume to: " + volume);
    }

    @Override
    public void decrease() {
        volume--;
        System.out.println("Decreased volume to: " + volume);
    }
}
