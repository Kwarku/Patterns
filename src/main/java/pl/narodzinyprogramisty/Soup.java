package pl.narodzinyprogramisty;

public abstract class Soup {
    public final void makeSoup(){
        makeChickenSoup();
        addAdditionalVegetable();
        addCarbohydrates();
    }

    private void makeChickenSoup() {
        System.out.println("gotujemy Rosołek!");
    }

    public abstract void addCarbohydrates();

    public abstract void addAdditionalVegetable();


}
