public class SmartThermostat extends SmartDevice {
    private int currentTemperature;

    public SmartThermostat(String name, int currentTemperature) {
        super(name);
        this.currentTemperature = currentTemperature;
    }

    @Override
    public void performAction() {
        System.out.println("Maintaining temperature at " + currentTemperature + " °C");
    }

    @Override
    public void checkStatus() {
        System.out.println("Thermostat is " + (isOn ? "ON" : "OFF") + " current temp: " + currentTemperature);
    }

    @Override
    public void updateFirmware() {
        System.out.println(name + " обновился");
    }
}
