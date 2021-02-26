package homeWork3.pattern.templateMethod;

public class JeepCar extends Vehicle {
    @Override
    boolean checkIsFuelTankIsNotEmpty() {
        return isFuelTankIsNotEmpty();
    }

    @Override
    void startEngine() {
        startGasEngine();
    }

    @Override
    void pushGas() {
        pushGasPedal();
    }

    @Override
    void spinWheels() {
        System.out.println("Four wheels spinning");
    }

    private boolean isFuelTankIsNotEmpty() {
        System.out.println("Tank has fuel");
        return true;
    }

    private void startGasEngine() {
        System.out.println("Gas engine started");
    }

    private void pushGasPedal() {
        System.out.println("Gas pedal pushed");
    }
}
