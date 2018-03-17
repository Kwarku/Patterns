package pl.narodzinyprogramisty.Bridge;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<RemoteController> controllers = new ArrayList<>();
        controllers.add(new RemoteController(new TvSwitcher()));
        controllers.add(new RemoteController(new RadioSwitcher()));

        controllers.stream().forEach(RemoteController::turnOn);
        controllers.stream().forEach(RemoteController::turnOff);
    }
}
