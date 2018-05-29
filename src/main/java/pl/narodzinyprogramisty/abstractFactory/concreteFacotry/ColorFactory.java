package pl.narodzinyprogramisty.abstractFactory.concreteFacotry;

import pl.narodzinyprogramisty.abstractFactory.AbstractFactory;
import pl.narodzinyprogramisty.abstractFactory.colors.BlueColor;
import pl.narodzinyprogramisty.abstractFactory.colors.Color;
import pl.narodzinyprogramisty.abstractFactory.colors.GreenColor;
import pl.narodzinyprogramisty.abstractFactory.colors.RedColor;
import pl.narodzinyprogramisty.abstractFactory.shapes.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        } else if (color.equalsIgnoreCase("RED")) {
            return new RedColor();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new BlueColor();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new GreenColor();
        }


        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
