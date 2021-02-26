package homeWork3.pattern.strategy;

public class VideoStrategy implements PlayerStrategy{
    @Override
    public void play(Screen screen, Speaker speaker) {
        screen.show("VideoLine");
        speaker.makeSound("AudioLine");
    }
}
