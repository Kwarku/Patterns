package pl.narodzinyprogramisty.Proxy;

public class BankAccount implements BankOperation{
    private String cardId;
    private int saldo;

    public BankAccount(String cardId) {
        this.cardId = cardId;
        saldo = 500;
    }

    @Override
    public void transfer(int amount) {
        saldo -= amount;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
