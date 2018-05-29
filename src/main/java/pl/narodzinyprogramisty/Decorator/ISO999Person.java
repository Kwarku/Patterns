package pl.narodzinyprogramisty.Decorator;

/**
 * Decorator pattern
 * Add some logic/ method / field to exist class.
 *
 * Use inheritance or polymorphism to wrap our class and then add our logic.
 *
 * */
//Decorator Pattern
public class ISO999Person implements PersonInfo {
    private Person person;
    private String firstName;
    private long pesel;

    public ISO999Person(Person person, String firstName, long pesel) {
        this.person = person;
        this.firstName = firstName;
        this.pesel = pesel;
    }

    @Override
    public void showAllInfo() {
        person.showAllInfo();
        System.out.printf(" First name: %s, pesel: %d",firstName,pesel);
    }
}
