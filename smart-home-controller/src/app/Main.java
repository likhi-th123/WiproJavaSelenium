package app;

import controller.DeviceController;

public class Main {
    public static void main(String[] args) {
        DeviceController deviceControl = new DeviceController();

        System.out.println("Controlling SmartLight:");
        deviceControl.smartLight();

        System.out.println("\nControlling SmartFan:");
        deviceControl.smartFan(); 

        System.out.println("\nControlling SmartAC:");
        deviceControl.smartAC();

        System.out.println("\nControlling SmartTV:");
        deviceControl.smartTV(); 
    }
}
