package homeWork3.pattern.observer;

public class NewsPaper {
    private final PaperType type;

    public NewsPaper(PaperType type) {
        this.type = type;
    }

    public PaperType getType() {
        return type;
    }

    public enum PaperType {
        NEWS,TVPROGRAMM,PUZZLES
    }
}
