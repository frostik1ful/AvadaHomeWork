package homeWork2.pattern.facade;

public class CarStarterFacade {

    public void startCar(Car car) {
        FuelTank fuelTank = car.getFuelTank();
        Battery battery = car.getBattery();
        Engine engine = car.getEngine();
        if (battery.isCharged()) {
            if (!fuelTank.isEmpty()) {
                engine.addFuel(car.getFuelPump().getFuelFromTank(battery.getEnergy(), fuelTank));
                engine.start();
            }
        }

    }
}
