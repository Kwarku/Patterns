package pl.narodzinyprogramisty.Proxy;

public interface BankOperation {
    void transfer(int amount) throws ErrorCardValidateException;
}
