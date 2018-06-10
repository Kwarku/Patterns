package pl.narodzinyprogramisty;

public class TomatoSoup extends Soup {

    @Override
    public void addCarbohydrates() {
        System.out.println("dodajemy zaciereczki!");

    }

    @Override
    public void addAdditionalVegetable() {
        System.out.println("dodajemy pomiodory i marchewke!");
    }
}
