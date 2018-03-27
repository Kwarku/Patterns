package pl.narodzinyprogramisty.Strategy;

public interface PaymentStrategy {
    boolean payment(double price, String accountId);
}
