package homeWork3.pattern.mediator;

import homeWork3.pattern.iterator.User;

import java.util.List;
import java.util.stream.Collectors;

public class MediatorImpl implements Mediator{
    private final List<ChatUser> users;

    public MediatorImpl(List<ChatUser> users) {
        this.users = users;
    }

    @Override
    public void sendMessages(String message, ChatUser user) {
        if (user.getUserType() == User.UserType.USER){
            users.stream()
                    .filter(user1 -> user1.getUserType() == User.UserType.USER)
                    .forEach(user1 -> user1.addMessage(message));
        }
        else {
            users.stream()
                    .filter(user1 -> user1.getUserType() == User.UserType.ADMIN)
                    .forEach(user1 -> user1.addMessage(message));
        }
    }
}
