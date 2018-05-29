package pl.narodzinyprogramisty.abstractFactory.colors;

public class GreenColor implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green class, fill() method");
    }
}
