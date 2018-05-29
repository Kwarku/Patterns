package pl.narodzinyprogramisty.Bridge;

public class RadioSwitcher implements SwitchAPI {
    public void turnOn() {
        System.out.println("radio turn on");
    }

    public void turnOff() {
        System.out.println("Radio turn off");
    }
}
