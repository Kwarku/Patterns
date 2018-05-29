package pl.narodzinyprogramisty.factoryMethod;

/**
 * Factory method pattern.
 * This ShapeFactory class create all Shape type object.
 * Use one interface(Shape) to do this.
 * <p>
 * Factory method create obj without exposing create logic to the client.
 */

public class ShapeFactory {
    public static Shape getShape(String shape) {

        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
