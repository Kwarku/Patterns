package pl.narodzinyprogramisty.abstractFactory.colors;

public class BlueColor implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue class, fill() method");
    }
}
