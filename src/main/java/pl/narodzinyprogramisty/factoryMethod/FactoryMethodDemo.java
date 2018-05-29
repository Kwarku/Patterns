package pl.narodzinyprogramisty.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();


        shapeList.add(ShapeFactory.getShape("circle"));
        shapeList.add(ShapeFactory.getShape("rectangle"));
        shapeList.add(ShapeFactory.getShape("SquAre"));

        shapeList.forEach(Shape::draw);
    }
}
