package pl.narodzinyprogramisty.Proxy;

public class ErrorCardValidateException extends Exception {
    public ErrorCardValidateException(){
        super("Credit card not valid!");
    }
}
