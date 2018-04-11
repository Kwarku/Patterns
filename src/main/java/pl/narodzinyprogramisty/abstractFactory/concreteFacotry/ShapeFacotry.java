package pl.narodzinyprogramisty.abstractFactory.concreteFacotry;

import pl.narodzinyprogramisty.abstractFactory.AbstractFactory;
import pl.narodzinyprogramisty.abstractFactory.colors.Color;
import pl.narodzinyprogramisty.abstractFactory.shapes.Circle;
import pl.narodzinyprogramisty.abstractFactory.shapes.Rectangle;
import pl.narodzinyprogramisty.abstractFactory.shapes.Shape;
import pl.narodzinyprogramisty.abstractFactory.shapes.Square;

public class ShapeFacotry extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }


}
