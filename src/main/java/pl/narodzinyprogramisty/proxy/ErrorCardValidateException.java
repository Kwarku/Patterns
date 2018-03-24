package pl.narodzinyprogramisty.proxy;

public class ErrorCardValidateException extends Exception {
    public ErrorCardValidateException(){
        super("Credit card not valid!");
    }
}
