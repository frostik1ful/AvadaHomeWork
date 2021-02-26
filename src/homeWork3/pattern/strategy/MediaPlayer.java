package homeWork3.pattern.strategy;

public class MediaPlayer {
    private PlayerStrategy strategy;
    private final Screen screen = new Screen();
    private final Speaker speaker = new Speaker();
    public void play(){
        if (strategy != null){
            strategy.play(screen,speaker);
        }
    }
    public void setStrategy(PlayerStrategy strategy){
        this.strategy = strategy;

    }
}
