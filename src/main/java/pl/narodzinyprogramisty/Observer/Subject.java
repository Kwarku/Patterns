package pl.narodzinyprogramisty.Observer;

public interface Subject {

    void subscribe(Observer obj);

    void unSubscribe(Observer obj);

    void sandNotify(String msg);
}
