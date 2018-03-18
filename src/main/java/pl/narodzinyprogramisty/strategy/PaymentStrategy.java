package pl.narodzinyprogramisty.strategy;

public interface PaymentStrategy {
    boolean payment(double price, String accountId);
}
