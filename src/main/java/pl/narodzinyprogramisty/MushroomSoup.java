package pl.narodzinyprogramisty;

public class MushroomSoup extends Soup {
    @Override
    public void addCarbohydrates() {
        System.out.println("dodaj makaron!");
    }

    @Override
    public void addAdditionalVegetable() {
        System.out.println("dodajemy grzybki: ");
    }
}
