package homeWork3.pattern.observer;

public class SubUser implements Subscriber {
    private final String name;

    public SubUser(String name) {
        this.name = name;
    }

    @Override
    public void addNewNewsPaper(NewsPaper newsPaper) {
        System.out.println("Subscriber " + name + " get " + newsPaper.getType());
    }
}
