package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

// Classe de conexão com o bando de dados (Postgresql)
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            String url = "jdbc:postgresql://localhost:80/pharmacy"; // Endereço do banco
            Properties props = new Properties();
            props.setProperty("user", "user"); // Usuário do banco
            props.setProperty("password", "password"); // Senha do banco
            Connection conn = DriverManager.getConnection(url, props);
            return conn;
        } catch (Exception error) {
            throw new RuntimeException("Error: " + error);
        }
    }

}
