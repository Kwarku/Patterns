package pl.narodzinyprogramisty.Mediator;

public interface ChatMediator {
    void sandMessage(String msg, User user);

    void addUser(User user);
}
