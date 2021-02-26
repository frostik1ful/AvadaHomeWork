package homeWork3.pattern.templateMethod;

public abstract class Vehicle {
    public void start() {
        if (checkIsFuelTankIsNotEmpty()) {
            startEngine();
            pushGas();
            spinWheels();
        }
    }

    abstract boolean checkIsFuelTankIsNotEmpty();

    abstract void startEngine();

    abstract void pushGas();

    void spinWheels() {
        System.out.println("Two rear wheels spinning");
    }
}
