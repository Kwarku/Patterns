package pl.narodzinyprogramisty.Reflection;

import java.lang.reflect.Method;

public class BirdReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> birdClass = Class.forName("pl.narodzinyprogramisty.Reflection.Bird");
        Bird bird = (Bird) birdClass.newInstance();
        Method setWalksMethod = birdClass.getDeclaredMethod("setWalks", boolean.class);
        setWalksMethod.setAccessible(true);
        setWalksMethod.invoke(bird, true);

        Method walksMethod = birdClass.getDeclaredMethod("isWalks");
        walksMethod.setAccessible(true);

        boolean walks = (boolean) walksMethod.invoke(bird);
        System.out.println(walks);
    }
}
