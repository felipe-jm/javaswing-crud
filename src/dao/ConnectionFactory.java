package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            String url = "jdbc:postgresql://localhost:80/pharmacy"; // Endereço do banco
            Properties props = new Properties(); 
            props.setProperty("user", "postgres"); // usuario do banco
            props.setProperty("password", "senha"); // senha do banco
            Connection conn = DriverManager.getConnection(url, props);
            return conn;
        } catch (Exception error) {
            throw new RuntimeException("Error: " + error);
        }
    }

}
