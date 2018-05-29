package pl.narodzinyprogramisty.abstractFactory.colors;

public class RedColor implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red class, fill() method");
    }
}
