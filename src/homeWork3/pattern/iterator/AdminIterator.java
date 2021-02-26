package homeWork3.pattern.iterator;

import java.util.List;
import java.util.stream.Collectors;

public class AdminIterator extends Iterator{

    public AdminIterator(List<User> list) {
        super(list);
    }

    @Override
    void addRequiredUsers(List<User> list) {
        users.addAll(list.stream()
                .filter(user -> user.getUserType() == User.UserType.ADMIN)
                .collect(Collectors.toList()));
    }

    @Override
    public boolean hasNext() {
        return position < users.size();
    }

    @Override
    public User getNext() {
        if (hasNext()){
            return users.get(position++);
        }
        else {
            return null;
        }
    }
}
