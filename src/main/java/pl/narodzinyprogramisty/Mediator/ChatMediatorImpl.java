package pl.narodzinyprogramisty.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sandMessage(String msg, User user) {

        if (this.users.size() == 1) {
            user.receive("you are alone on this chat");
        }else {

            users.forEach(e -> {
                if (e != user) {
                    e.receive(msg);
                }
            });
        }

    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
