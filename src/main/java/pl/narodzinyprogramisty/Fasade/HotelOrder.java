package pl.narodzinyprogramisty.Fasade;

public class HotelOrder implements Book {
    @Override
    public void book() {
        System.out.println("Your hotel is booked");
    }
}
