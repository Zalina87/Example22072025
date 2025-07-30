import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SmartDevice> smartDevices = new ArrayList<>();
        smartDevices.add(new SmartLight("Лампа в гостинной",100));
        smartDevices.add(new SmartThermostat("Термостат на кухне",100));

        for (SmartDevice smartDevice : smartDevices) {
            smartDevice.performAction();
            smartDevice.turnOn();
            smartDevice.checkStatus();
            smartDevice.turnOff();
            smartDevice.checkStatus();
            smartDevice.updateFirmware();
        }
    }
}
