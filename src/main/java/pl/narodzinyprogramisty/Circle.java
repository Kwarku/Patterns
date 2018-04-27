package pl.narodzinyprogramisty;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle class :: draw() method");
    }
}
