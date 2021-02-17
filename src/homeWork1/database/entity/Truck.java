package homeWork1.database.entity;

public class Truck extends Vehicle{
    public Truck(String name, int numberOfWheels, int numberOfDoors) {
        super(name, numberOfWheels, numberOfDoors, VehicleType.TRUCK);
    }
}
