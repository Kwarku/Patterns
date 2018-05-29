package pl.narodzinyprogramisty.Fasade;

public class FoodOrder implements Book {
    @Override
    public void book() {
        System.out.println("Your food order is booked");
    }
}
