package homeWork3.pattern.observer;

public class Subscription {
    private final Subscriber subscriber;
    private final NewsPaper.PaperType paperType;

    public Subscription(Subscriber subscriber, NewsPaper.PaperType paperType) {
        this.subscriber = subscriber;
        this.paperType = paperType;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public NewsPaper.PaperType getPaperType() {
        return paperType;
    }
}
