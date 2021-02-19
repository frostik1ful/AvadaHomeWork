package homeWork2.pattern.facade;

public class Car {
    private final Engine engine = new Engine();
    private final FuelTank fuelTank = new FuelTank();
    private final Battery battery = new Battery();
    private final FuelPump fuelPump = new FuelPump();

    public Engine getEngine() {
        return engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public Battery getBattery() {
        return battery;
    }

    public FuelPump getFuelPump() {
        return fuelPump;
    }
}
