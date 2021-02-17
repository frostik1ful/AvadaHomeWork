package homeWork1.pattern.factory;

import homeWork1.database.entity.*;

public class VehicleFactory {
    public Vehicle createCar(String name, int numberOfWheels, int numberOfDoors) {
        return new Car(name, numberOfWheels, numberOfDoors);

    }

    public Vehicle createMotorcycle(String name, int numberOfWheels) {
        return new Motorcycle(name, numberOfWheels);
    }

    public Vehicle createBus(String name, int numberOfWheels, int numberOfDoors) {
        return new Bus(name, numberOfWheels, numberOfDoors);
    }

    public Vehicle createTruck(String name, int numberOfWheels, int numberOfDoors) {
        return new Truck(name, numberOfWheels, numberOfDoors);
    }
}
