package homeWork3.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class Iterator {
    List<User> users = new ArrayList<>();
    int position;
    public Iterator(List<User> list){
        addRequiredUsers(list);
    }
    abstract void addRequiredUsers(List<User> list);
    public abstract boolean hasNext();
    public abstract User getNext();
}
