/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubesss;

/**
 *
 * @author aulia
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection { // Ganti nama kelas untuk menghindari konflik
    private static final String URL = "jdbc:mysql://localhost:3306/restoran"; // Ganti dengan nama database Anda
    private static final String USER = "root"; // Ganti dengan username MySQL Anda
    private static final String PASSWORD = "root"; // Ganti dengan password MySQL Anda

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
        connect(); // Tes koneksi
    }
}

