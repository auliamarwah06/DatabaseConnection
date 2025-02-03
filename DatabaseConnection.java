/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubesss;

/**
 *
 * @author Aulia Marwah K
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection { 
    private static final String URL = "jdbc:mysql://localhost:3306/restoran"; 
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection connect() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); 
            System.out.println("Koneksi berhasil!");
            return connection;
        } catch (SQLException e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        connect(); 
    }
}
