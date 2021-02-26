package homeWork3.pattern.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PostOffice implements Publisher {
    private final List<Subscription> subscriptions = new LinkedList<>();

    @Override
    public void subscribe(Subscriber subscriber, NewsPaper.PaperType type) {
        subscriptions.add(new Subscription(subscriber, type));
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        List<Subscription> subscriptionsToRemove = subscriptions
                .stream()
                .filter(sub -> sub.getSubscriber().equals(subscriber))
                .collect(Collectors.toList());
        subscriptions.removeAll(subscriptionsToRemove);
    }

    @Override
    public void addNewsPaper(NewsPaper newsPaper) {
        subscriptions.stream()
                .filter(sub -> sub.getPaperType() == newsPaper.getType())
                .forEach(sub -> sub.getSubscriber().addNewNewsPaper(newsPaper));
    }


}
