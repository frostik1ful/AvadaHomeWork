package homeWork1.database.entity;

public class Motorcycle extends Vehicle{
    public Motorcycle(String name, int numberOfWheels) {
        super(name, numberOfWheels, 0, VehicleType.MOTORCYCLE);
    }
}
