package pl.narodzinyprogramisty.proxy;

public interface BankOperation {
    void transfer(int amount) throws ErrorCardValidateException;
}
