package pl.narodzinyprogramisty.abstractFactory;

import pl.narodzinyprogramisty.abstractFactory.colors.Color;
import pl.narodzinyprogramisty.abstractFactory.shapes.Shape;


/**
 * Abstract Factory Pattern
 * Create one abstract class with some abstract methods. This class it will be our abstract factory.
 * Then create concrete factories, creating one type of objects. In this example create Shape or Color object.
 * Shape and Color are interface, which one gives necessary methods.
 *
 * At last create Factory producer which using static method gives our factories to main class.
 *
 * */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
