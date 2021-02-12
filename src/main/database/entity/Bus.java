package main.database.entity;

public class Bus extends Vehicle{
    public Bus(String name, int numberOfWheels, int numberOfDoors) {
        super(name, numberOfWheels, numberOfDoors, VehicleType.BUS);
    }
}
