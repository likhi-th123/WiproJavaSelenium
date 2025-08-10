package devices;

public class SmartLight implements SmartDevice, Adjustable {
    private int brightness;

    public SmartLight() {
        this.brightness = 5;
    }

    @Override
    public void turnOn() {
        System.out.println("SmartLight is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLight is OFF");
    }

    @Override
    public void increase() {
        brightness++;
        System.out.println("Increased brightness to: " + brightness);
    }

    @Override
    public void decrease() {
        brightness--;
        System.out.println("Decreased brightness to: " + brightness);
    }
}
