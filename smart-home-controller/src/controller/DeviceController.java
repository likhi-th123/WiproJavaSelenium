package controller;

import devices.SmartLight;
import devices.SmartFan;
import devices.SmartAC;
import devices.SmartTV;

public class DeviceController {
    SmartLight smartLight = new SmartLight();
    SmartFan smartFan = new SmartFan();
    SmartAC smartAC = new SmartAC();
    SmartTV smartTV = new SmartTV();

    public void smartLight() {
        smartLight.turnOn();
        smartLight.increase();
        smartLight.decrease();
        smartLight.turnOff();
    }

    public void smartFan() {
        smartFan.turnOn();
        smartFan.increase();
        smartFan.decrease();
        smartFan.turnOff();
    }

    public void smartAC() {
        smartAC.turnOn();
        smartAC.increase();
        smartAC.decrease();
        smartAC.turnOff();
    }

    public void smartTV() {
        smartTV.turnOn();
        smartTV.increase();
        smartTV.decrease();
        smartTV.turnOff();
    }
}
