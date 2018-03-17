package pl.narodzinyprogramisty.Bridge;


/*
* Ta klasa jest logika MOSTU. Controller orzymuje w konstruktorze dowolną implementacje API
* nastepnie wywokuje publiczne metody. Niezaleznie co przekazemy a bedzie implementowalo SwitchAPI.
*
* */

public class RemoteController {
    private final SwitchAPI switchAPI;

    public RemoteController(SwitchAPI switchAPI) {
        this.switchAPI = switchAPI;
    }

    public void turnOn() {
        switchAPI.turnOn();
    }

    public void turnOff() {
        switchAPI.turnOff();
    }
}
