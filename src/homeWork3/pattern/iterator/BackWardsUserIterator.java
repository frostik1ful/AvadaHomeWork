package homeWork3.pattern.iterator;

import java.util.List;
import java.util.stream.Collectors;

public class BackWardsUserIterator extends Iterator {
    public BackWardsUserIterator(List<User> list) {
        super(list);
    }

    @Override
    void addRequiredUsers(List<User> list) {
        users.addAll(list.stream()
                .filter(user -> user.getUserType() == User.UserType.USER)
                .collect(Collectors.toList()));
        position = users.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position > -1;
    }

    @Override
    public User getNext() {
        if (hasNext()) {
            return users.get(position--);
        } else {
            return null;
        }


    }
}
