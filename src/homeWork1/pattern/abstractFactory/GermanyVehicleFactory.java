package homeWork1.pattern.abstractFactory;

import homeWork1.database.entity.*;

public class GermanyVehicleFactory implements AbstractVehicleFactory {
    @Override
    public Vehicle createCar() {
        return new Car("Audi", 4, 2);
    }

    @Override
    public Vehicle createMotorcycle() {
        return new Motorcycle("BMW", 2);
    }

    @Override
    public Vehicle createBus() {
        return new Bus("Mercedes", 4, 6);
    }

    @Override
    public Vehicle createTruck() {
        return new Truck("MAN", 6, 2);
    }
}
