package homeWork3.pattern.templateMethod;

public class TeslaCar extends Vehicle {
    @Override
    boolean checkIsFuelTankIsNotEmpty() {
        return isBatteryCharged();
    }

    @Override
    void startEngine() {
        startElectricEngine();
    }

    @Override
    void pushGas() {
        pushDriveButton();
    }


    private boolean isBatteryCharged() {
        System.out.println("Battery charged");
        return true;
    }

    private void startElectricEngine() {
        System.out.println("Electric engine started");
    }

    private void pushDriveButton() {
        System.out.println("Drive button pushed");
    }

}
