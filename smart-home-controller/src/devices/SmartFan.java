package devices;

public class SmartFan implements SmartDevice, Adjustable {
    private int speed;

    public SmartFan() {
        this.speed = 2;
    }
    

    @Override
    public void turnOn() {
        System.out.println("SmartFan is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartFan is OFF");
    }

    @Override
    public void increase() {
        speed++;
        System.out.println("Increased fan speed to: " + speed);
    }

    @Override
    public void decrease() {
        speed--;
        System.out.println("Decreased fan speed to: " + speed);
    }

}
