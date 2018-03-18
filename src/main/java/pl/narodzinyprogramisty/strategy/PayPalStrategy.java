package pl.narodzinyprogramisty.strategy;

public class PayPalStrategy implements PaymentStrategy{
    private String email;
    private String password;
    private double balance;

    public PayPalStrategy(String email, String password, double balance) {
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    @Override
    public boolean payment(double price, String accountId) {
        return price > 0 && price <= balance;
    }
}
