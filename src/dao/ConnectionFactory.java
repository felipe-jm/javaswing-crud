package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jbdc:postgres//localhost/pharmacy", "postgres", "docker");
        }catch(Exception error){
            throw new RuntimeException("Error: " + error);
        }
    }
    
}
