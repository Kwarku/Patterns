package pl.narodzinyprogramisty.Bridge;

public class TvSwitcher implements SwitchAPI {
    public void turnOn() {
        System.out.println("Tv turn on");
    }

    public void turnOff() {
        System.out.println("Tv turn off");
    }
}
