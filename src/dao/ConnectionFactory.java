package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            String url = "jdbc:postgresql://localhost/pharmacy";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "docker");
            Connection conn = DriverManager.getConnection(url, props);
            return conn;
        } catch (Exception error) {
            throw new RuntimeException("Error: " + error);
        }
    }

}
