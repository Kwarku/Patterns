package pl.narodzinyprogramisty.Fasade;


/**
 * This is facade pattern.
 * Take some operations and hide in own one method. Then user can use only this @bookTravel() method,
 * and facade do all work for him.
 * */
public class TravelRequest {
    private FoodOrder foodOrder;
    private HotelOrder hotelOrder;
    private TicketOrder ticketOrder;


    public TravelRequest(){
        this.foodOrder = new FoodOrder();
        this.hotelOrder = new HotelOrder();
        this.ticketOrder = new TicketOrder();
    }

    public void bookTravel(){
        foodOrder.book();
        hotelOrder.book();
        ticketOrder.book();

        System.out.println("Your travel can start now. Have a nice day");
    }
}
