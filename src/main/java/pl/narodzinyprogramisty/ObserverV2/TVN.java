package pl.narodzinyprogramisty.ObserverV2;

public class TVN implements Channel {

    @Override
    public void update(String text) {
        System.out.println("TVN : " + text);
    }
}
