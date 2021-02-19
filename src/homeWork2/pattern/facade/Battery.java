package homeWork2.pattern.facade;

public class Battery {
    private Energy energy = new Energy();

    public boolean isCharged() {
        return true;
    }

    public Energy getEnergy() {
        return energy;
    }
}
