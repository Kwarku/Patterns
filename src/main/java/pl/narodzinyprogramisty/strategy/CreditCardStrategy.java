package pl.narodzinyprogramisty.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String creditCartId;
    private String ccc;
    private String owner;
    private double balance;

    public CreditCardStrategy(String creditCartId, String ccc, String owner, double balance) {
        this.creditCartId = creditCartId;
        this.ccc = ccc;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public boolean payment(double price, String accountId) {
        return price > 0 && price <= balance;

    }
}
