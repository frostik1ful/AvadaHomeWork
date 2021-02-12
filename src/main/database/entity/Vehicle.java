package main.database.entity;

public class Vehicle {
    private long id;
    private String name;
    private int numberOfWheels;
    private int numberOfDoors;
    private VehicleType type;


    public Vehicle(long id, String name, int numberOfWheels, int numberOfDoors, VehicleType type) {
        this(name, numberOfWheels, numberOfDoors, type);
        this.id = id;
    }

    public Vehicle(String name, int numberOfWheels, int numberOfDoors, VehicleType type) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.type = type;
    }
    public Vehicle getClone(){
        return new Vehicle(getId(),getName(),getNumberOfWheels(),getNumberOfDoors(),getType());
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", numberOfDoors=" + numberOfDoors +
                ", type=" + type +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public enum VehicleType {
        CAR, MOTORCYCLE, BUS, TRUCK
    }
}
