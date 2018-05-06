package pl.narodzinyprogramisty.ObserverV2;

public class Polsat implements Channel {

    @Override
    public void update(String text) {
        System.out.println("Polsat : " + text);
    }
}
