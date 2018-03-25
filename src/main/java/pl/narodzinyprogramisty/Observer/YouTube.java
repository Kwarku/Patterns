package pl.narodzinyprogramisty.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTube implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer obj) {
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unSubscribe(Observer obj) {
        if (observers.contains(obj)) {
            observers.remove(obj);
        }
    }

    @Override
    public void sandNotify(String msg) {
        observers.forEach(e -> e.update(msg));
        System.out.println();

    }
}
