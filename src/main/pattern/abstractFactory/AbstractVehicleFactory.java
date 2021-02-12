package main.pattern.abstractFactory;

import main.database.entity.Vehicle;

public interface AbstractVehicleFactory {
    Vehicle createCar();
    Vehicle createMotorcycle();
    Vehicle createBus();
    Vehicle createTruck();
}
