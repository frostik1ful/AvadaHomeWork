package homeWork3.pattern.templateMethod;

public class OldCar extends Vehicle {

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
