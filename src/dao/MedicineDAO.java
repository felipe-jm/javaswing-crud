package dao;

import model.Medicine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MedicineDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Medicine> medicines = new ArrayList<Medicine>();
    
    public Connection  MedicineDao(){
        conn = new ConnectionFactory().getConnection();
        return conn;
    }
    
    public void create(Medicine medicine){
        String sql = "INSERT INTO medicines  (name, description, composition, price) VALUES (?, ?, ?, ?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, medicine.getName());
            stmt.setString(2, medicine.getDescription());
            stmt.setString(3, medicine.getComposition());
            stmt.setDouble(4, medicine.getPrice());
            stmt.execute();
            stmt.close();
        } catch (Exception error) {
            throw new RuntimeException("Error: " + error);
        }
    }
    
    public ArrayList<Medicine> list(){
        String sql = "SELECT * FROM medicines";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Medicine medicine = new Medicine();
                medicine.setCode(rs.getInt("code"));
                medicine.setName(rs.getString("name"));
                medicine.setDescription(rs.getString("description"));
                medicine.setComposition(rs.getString("composition"));
                medicine.setPrice(rs.getDouble("price"));
                medicines.add(medicine);
            }
        } catch (Exception error) {
            throw new RuntimeException("Error: " + error);
        }
        return medicines;
    }
    
     public void update(Medicine medicine){
        String sql = "UPDATE medicines SET name = ?, description = ?, composition = ?, price = ? WHERE code = ? ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, medicine.getName());
            stmt.setString(2, medicine.getDescription());
            stmt.setString(3, medicine.getComposition());
            stmt.setDouble(4, medicine.getPrice());
            stmt.setInt(5, medicine.getCode());
            stmt.execute();
            stmt.close();
        } catch (Exception error) {
            throw new RuntimeException("Error: " + error);
        }
    }
     
      public void delete(int code){
        String sql = "DELETE FROM medicines WHERE code = " + code;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception error) {
            throw new RuntimeException("Error: " + error);
        }
    }
      
}
