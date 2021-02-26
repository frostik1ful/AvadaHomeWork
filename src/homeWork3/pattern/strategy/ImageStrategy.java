package homeWork3.pattern.strategy;

public class ImageStrategy implements PlayerStrategy{
    @Override
    public void play(Screen screen, Speaker speaker) {
        screen.show("Image");
    }
}
