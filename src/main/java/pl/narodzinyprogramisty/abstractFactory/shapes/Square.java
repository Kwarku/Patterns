package pl.narodzinyprogramisty.abstractFactory.shapes;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square class, draw() method");
    }
}
