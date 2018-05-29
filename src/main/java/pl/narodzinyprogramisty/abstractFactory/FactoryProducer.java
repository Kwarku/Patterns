package pl.narodzinyprogramisty.abstractFactory;

import pl.narodzinyprogramisty.abstractFactory.concreteFacotry.ColorFactory;
import pl.narodzinyprogramisty.abstractFactory.concreteFacotry.ShapeFacotry;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFacotry();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
