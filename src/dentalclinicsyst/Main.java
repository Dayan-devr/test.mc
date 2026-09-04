/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dentalclinicsyst;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author USER
 */
public class Main {
    
    public static void main(String[] args) {

        try {
            Connection connection = DBConnection.getConnection();

            if (connection != null && !connection.isClosed()) {
                System.out.println("=================================");
                System.out.println("Sunrise Dental Clinic System");
                System.out.println("=================================");
                System.out.println("Database connection successful!");
                System.out.println("Connected to: sunrise_dental");
                System.out.println("=================================");
            }

        } catch (SQLException e) {

            System.out.println("Database connection failed!");
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
