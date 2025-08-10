package devices;

public class SmartAC implements SmartDevice, Adjustable {
    private int temperature;

    public SmartAC() {
        this.temperature = 20;
    }

    @Override
    public void turnOn() {
        System.out.println("SmartAC is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartAC is OFF");
    }

    @Override
    public void increase() {
        temperature++;
        System.out.println("Increased temperature to: " + temperature + "°C");
    }

    @Override
    public void decrease() {
        temperature--;
        System.out.println("Decreased temperature to: " + temperature + "°C");
    }

}
