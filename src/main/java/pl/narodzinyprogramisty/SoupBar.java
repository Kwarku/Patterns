package pl.narodzinyprogramisty;

public class SoupBar {
    public static void main(String[] args) {
        Soup tomato = new TomatoSoup();
        Soup mushroom = new MushroomSoup();

        System.out.println("Pomidorowa");
        tomato.makeSoup();

        System.out.println("Grzybowa");
        mushroom.makeSoup();

    }
}
