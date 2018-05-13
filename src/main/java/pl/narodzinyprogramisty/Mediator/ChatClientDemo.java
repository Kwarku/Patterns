package pl.narodzinyprogramisty.Mediator;

public class ChatClientDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user = new UserImpl(mediator, "Andzej");
        User user1 = new UserImpl(mediator, "Krzysztof");
        User user2 = new UserImpl(mediator, "Zdzisław");
        User user3 = new UserImpl(mediator, "Dawid");

        mediator.addUser(user);
//        mediator.addUser(user1);
//        mediator.addUser(user2);
//        mediator.addUser(user3);

        user.send("Hi all");
    }
}
