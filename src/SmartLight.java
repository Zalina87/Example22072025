public class SmartLight extends SmartDevice {
    private int brightness;

    public SmartLight(String name, int brightness) {
        super(name);
        this.brightness = brightness;
    }

    @Override
    public void performAction() {
        System.out.println("Light is shining at " + brightness + " % brightness");
    }

    @Override
    public void checkStatus() {
        System.out.println("Light is " + (isOn ? "ON" : "OFF") + ", brightness: " + brightness);
    }

    @Override
    public void updateFirmware() {
        System.out.println(name + " обновилась");
    }
}
