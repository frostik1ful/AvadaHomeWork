package homeWork1.pattern.abstractFactory;

import homeWork1.database.entity.*;

public class AmericanVehicleFactory implements AbstractVehicleFactory{
    @Override
    public Vehicle createCar() {
        return new Car("Ford",4,4);
    }

    @Override
    public Vehicle createMotorcycle() {
        return new Motorcycle("Harley-Davidson",2);
    }

    @Override
    public Vehicle createBus() {
        return new Bus("MCI",6,4);
    }

    @Override
    public Vehicle createTruck() {
        return new Truck("Mack",6,2);
    }
}
