package homeWork1.database.connector;

import homeWork1.pattern.builder.ConnectionBuilder;

import java.sql.Connection;
import java.sql.SQLException;

public class Connector {
    private static Connector instance;
    private Connection connection;
    private ConnectionBuilder connectionBuilder;
    private Connector(){
        connectionBuilder = new ConnectionBuilder();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = connectionBuilder.buildConnection().setUrl("jdbc:mysql://localhost:3306/vehicle?serverTimezone=UTC")
                    .setUserName("root")
                    .setPassword("pass1234")
                    .build();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Connector getInstance(){
        if (instance == null){
            instance = new Connector();
        }
        return instance;
    }
    public Connection getConnection(){
        return connection;
    }
}
