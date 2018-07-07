package pl.narodzinyprogramisty.Reflection;

import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "pl.narodzinyprogramisty.Reflection.Bar";
        Class c = Class.forName(className);
        Method[] m = c.getDeclaredMethods();

        for (Method method : m) {
            System.out.println("Klasa " + className + " ma metode : '" + method.getName().toString() + "'");
            System.out.println("która zwraca wartosc typu : " + method.getReturnType().toString() + " \n");
        }
    }
}
