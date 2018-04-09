package pl.narodzinyprogramisty.Decorator;

public class Person implements PersonInfo {
    private String lastName;
    private int id;

    public Person(String lastName, int id) {
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public void showAllInfo() {
        System.out.printf("\nLast name: %s, id: %d", lastName, id);
    }
}
