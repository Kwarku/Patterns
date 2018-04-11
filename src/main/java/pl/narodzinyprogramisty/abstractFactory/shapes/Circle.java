package pl.narodzinyprogramisty.abstractFactory.shapes;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle class, draw() method");
    }
}
