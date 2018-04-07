package pl.narodzinyprogramisty.Fasade;

public class TicketOrder implements Book {
    @Override
    public void book() {
        System.out.println("Your ticket is booked");
    }
}
