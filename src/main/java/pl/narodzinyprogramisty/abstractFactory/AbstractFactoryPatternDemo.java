package pl.narodzinyprogramisty.abstractFactory;

import pl.narodzinyprogramisty.abstractFactory.colors.Color;
import pl.narodzinyprogramisty.abstractFactory.shapes.Shape;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        List<Shape> shapeList = new LinkedList<>();
        List<Color> colorList = new ArrayList<>();

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        shapeList.add(shapeFactory.getShape("CIRCLE"));
        shapeList.add(shapeFactory.getShape("rectangle"));
        shapeList.add(shapeFactory.getShape("square"));


        colorList.add(colorFactory.getColor("red"));
        colorList.add(colorFactory.getColor("green"));
        colorList.add(colorFactory.getColor("blue"));

        System.out.println("shape list");
        shapeList.forEach(Shape::draw);

        System.out.println("\n\ncolor list ");
        colorList.forEach(Color::fill);


    }
}
