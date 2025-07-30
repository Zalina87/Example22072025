public abstract class SmartDevice implements Controllable {
    protected String name;
    protected boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public abstract void performAction();

    public boolean isOn() {
        return isOn;

    }

    public void turnOn() {
        isOn = true;

    }

    public void turnOff() {
        isOn = false;

    }

    public abstract void checkStatus();
    public abstract void updateFirmware();
}
