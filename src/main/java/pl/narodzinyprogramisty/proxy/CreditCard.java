package pl.narodzinyprogramisty.proxy;

public class CreditCard implements BankOperation {

    private final String cartId;
    private final String pin;
    private final BankAccount bankAccount;

    public CreditCard(String cartId, String pin) {
        this.cartId = cartId;
        this.pin = pin;
        bankAccount = new BankAccount(cartId);
    }

    private boolean validate() {
        return pin.length() == 4 &&
                cartId.startsWith("PEKAO") &&
                cartId.length() == 10;
    }

    @Override
    public void transfer(int amount) throws ErrorCardValidateException {
        if (validate()) {
            bankAccount.transfer(amount);
        } else {
            throw  new ErrorCardValidateException();
        }
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }
}
