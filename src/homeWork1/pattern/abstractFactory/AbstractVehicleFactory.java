package homeWork1.pattern.abstractFactory;

import homeWork1.database.entity.Vehicle;

public interface AbstractVehicleFactory {
    Vehicle createCar();
    Vehicle createMotorcycle();
    Vehicle createBus();
    Vehicle createTruck();
}
