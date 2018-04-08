package pl.narodzinyprogramisty.Decorator;

import java.util.Arrays;
import java.util.List;

public class DecoratorTest {
    public static void main(String[] args) {
        PersonInfo person = new Person("Kukiz", 12);
        PersonInfo person1 = new ISO999Person(new Person("Krzywonos", 13), "Bogusław", 92040616992L);

        List<PersonInfo> list = Arrays.asList(person, person1);

        list.forEach(p -> p.showAllInfo());
    }
}
