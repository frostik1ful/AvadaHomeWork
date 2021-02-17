package homeWork1.database.dao;

import homeWork1.database.entity.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicleDao {
    private final Connection connection;
    private final String saveSQL = "INSERT INTO VEHICLES (id,name,number_Of_Wheels,number_Of_Doors,type_of_wehicle) VALUES (?, ?, ?, ?, ?)";
    //private final String findVehicleByIdSQL = "SELECT * FROM VEHICLES WHERE id = ?";

    public VehicleDao(Connection connection) {
        this.connection = connection;
    }

    public void saveVehicle(Vehicle vehicle) {
        int vehicleTypeNumber = 0;
        for (int i = 0; i < Vehicle.VehicleType.values().length; i++) {
            if (vehicle.getType() == Vehicle.VehicleType.values()[i]) {
                vehicleTypeNumber = i;
            }
        }
        try {
            PreparedStatement statement = connection.prepareStatement(saveSQL);
            statement.setLong(1, vehicle.getId());
            statement.setString(2, vehicle.getName());
            statement.setInt(3, vehicle.getNumberOfWheels());
            statement.setInt(4, vehicle.getNumberOfDoors());
            statement.setInt(5, vehicleTypeNumber);
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public void findVehicleById(long id) {
//
//    }
}
