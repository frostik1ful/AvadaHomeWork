package homeWork1.database.entity;

public class Car extends Vehicle{
    public Car(String name, int numberOfWheels, int numberOfDoors) {
        super(name, numberOfWheels, numberOfDoors, VehicleType.CAR);
    }
}
