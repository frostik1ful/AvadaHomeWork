package homeWork3.pattern.strategy;

public class MusicStrategy implements PlayerStrategy{
    @Override
    public void play(Screen screen, Speaker speaker) {
        screen.show("AudioVisualisation");
        speaker.makeSound("Music.mp3");
    }
}
