package homeWork3.pattern.observer;

public interface Publisher {
    void subscribe(Subscriber subscriber, NewsPaper.PaperType type);
    void unsubscribe(Subscriber subscriber);
    void addNewsPaper(NewsPaper newsPaper);
}
