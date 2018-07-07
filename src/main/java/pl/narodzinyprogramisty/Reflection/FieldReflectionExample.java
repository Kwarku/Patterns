package pl.narodzinyprogramisty.Reflection;

import java.lang.reflect.Field;

public class FieldReflectionExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        FieldExample testField = new FieldExample();
        Field field;

        field = FieldExample.class.getField("name");
        System.out.println(field.get(testField));

        field.set(testField, "Kasia");
        System.out.println(field.get(testField));


    }
}

class FieldExample{
    public String name = "Pawel";
    public int age;
}
