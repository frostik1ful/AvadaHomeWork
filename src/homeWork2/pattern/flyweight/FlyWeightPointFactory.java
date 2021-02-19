package homeWork2.pattern.flyweight;

import homeWork1.database.entity.*;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightPointFactory {
    static Map<String, Vehicle> cache = new HashMap<>();
    public static Point createPoint(int x, int y, Vehicle.VehicleType vehicleType){
        Vehicle vehicle;
        String type=vehicleType.toString();
        vehicle  = cache.get(type);
        if (vehicle == null){
            switch (vehicleType){
                case CAR:
                    vehicle = new Car("name",4,4);
                    System.out.println("new car created");
                    cache.put(type,vehicle);
                    break;
                case BUS:
                    vehicle = new Bus("name",4,4);
                    cache.put(type,vehicle);
                    break;
                case MOTORCYCLE:
                    vehicle = new Motorcycle("name",2);
                    cache.put(type,vehicle);
                    break;
                case TRUCK:
                    vehicle = new Truck("name",6,2);
                    cache.put(type,vehicle);
                    break;
            }

        }
        return new Point(x,y,vehicle);

    }
}
