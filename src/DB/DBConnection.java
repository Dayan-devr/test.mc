/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author USER
 */
public class DBConnection {
    
     private static final String URL =
            "jdbc:mysql://localhost:3306/sunrise_dental";

    private static final String USERNAME = "root";

    private static final String PASSWORD = "";

    private static Connection connection;

    private DBConnection() {
        // Prevent object creation
    }

    public static Connection getConnection() throws SQLException {

        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(
                    URL,
                    USERNAME,
                    PASSWORD
            );
        }

        return connection;
    }

    public static void closeConnection() {

        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(
                        "Error closing database: "
                        + e.getMessage()
                );
            }
        }
    }
    
}
