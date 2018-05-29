package pl.narodzinyprogramisty.ObserverV2;

public class TVP1 implements Channel {

    @Override
    public void update(String text) {
        System.out.println("TVP1 : " + text);
    }
}
