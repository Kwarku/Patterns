package pl.narodzinyprogramisty.Queue;

public interface CashBox {

    void standInTheQueue(Customer customer);

    void handleCustomer() throws InterruptedException;

}
