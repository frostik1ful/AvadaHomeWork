package main;

import main.database.connector.Connector;
import main.database.dao.VehicleDao;
import main.database.entity.Car;
import main.database.entity.Vehicle;
import main.pattern.abstractFactory.AbstractVehicleFactory;
import main.pattern.abstractFactory.AmericanVehicleFactory;
import main.pattern.abstractFactory.GermanyVehicleFactory;
import main.pattern.factory.VehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        //singleton/builder
        Connector connector = Connector.getInstance();
        VehicleDao vehicleDao = new VehicleDao(connector.getConnection());

        //factory
        VehicleFactory factory = new VehicleFactory();

        vehicles.add(factory.createMotorcycle("Honda",2));
        vehicles.add(factory.createCar("Toyota",4,4));

        //abstract factory
        AbstractVehicleFactory germanyFactory = new GermanyVehicleFactory();
        AbstractVehicleFactory americanFactory = new AmericanVehicleFactory();

        vehicles.add(germanyFactory.createBus());
        vehicles.add(germanyFactory.createMotorcycle());

        //prototype
        Vehicle americanCar = americanFactory.createCar();
        Vehicle americanCarClone = americanCar.getClone();
        americanCar.setNumberOfWheels(3);

        vehicles.add(americanCar);
        vehicles.add(americanCarClone);


        vehicles.forEach(vehicleDao::saveVehicle);
    }
}
