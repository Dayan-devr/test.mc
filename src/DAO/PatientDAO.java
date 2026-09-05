/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DB.DBConnection;
import Model.Patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class PatientDAO {
    
    // Add new patient
    public boolean addPatient(Patient patient) {

        String sql = """
                INSERT INTO patients
                (patient_name, address, contact_number)
                VALUES (?, ?, ?)
                """;

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, patient.getPatientName());
            statement.setString(2, patient.getAddress());
            statement.setString(3, patient.getContactNumber());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Error adding patient: "
                    + e.getMessage());

            return false;
        }
    }

    // Get all patients
    public List<Patient> getAllPatients() {

        List<Patient> patients = new ArrayList<>();

        String sql = """
                SELECT patient_id, patient_name,
                       address, contact_number
                FROM patients
                ORDER BY patient_id DESC
                """;

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {

                Patient patient = new Patient();

                patient.setPatientId(
                        resultSet.getInt("patient_id")
                );

                patient.setPatientName(
                        resultSet.getString("patient_name")
                );

                patient.setAddress(
                        resultSet.getString("address")
                );

                patient.setContactNumber(
                        resultSet.getString("contact_number")
                );

                patients.add(patient);
            }

        } catch (SQLException e) {

            System.out.println("Error retrieving patients: "
                    + e.getMessage());
        }

        return patients;
    }

    // Search patient by name
    public List<Patient> searchPatients(String name) {

        List<Patient> patients = new ArrayList<>();

        String sql = """
                SELECT patient_id, patient_name,
                       address, contact_number
                FROM patients
                WHERE patient_name LIKE ?
                ORDER BY patient_name
                """;

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, "%" + name + "%");

            try (ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {

                    Patient patient = new Patient();

                    patient.setPatientId(
                            resultSet.getInt("patient_id")
                    );

                    patient.setPatientName(
                            resultSet.getString("patient_name")
                    );

                    patient.setAddress(
                            resultSet.getString("address")
                    );

                    patient.setContactNumber(
                            resultSet.getString("contact_number")
                    );

                    patients.add(patient);
                }
            }

        } catch (SQLException e) {

            System.out.println("Error searching patients: "
                    + e.getMessage());
        }

        return patients;
    }

    // Update patient
    public boolean updatePatient(Patient patient) {

        String sql = """
                UPDATE patients
                SET patient_name = ?,
                    address = ?,
                    contact_number = ?
                WHERE patient_id = ?
                """;

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, patient.getPatientName());
            statement.setString(2, patient.getAddress());
            statement.setString(3, patient.getContactNumber());
            statement.setInt(4, patient.getPatientId());

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Error updating patient: "
                    + e.getMessage());

            return false;
        }
    }

    // Delete patient
    public boolean deletePatient(int patientId) {

        String sql = """
                DELETE FROM patients
                WHERE patient_id = ?
                """;

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, patientId);

            return statement.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Error deleting patient: "
                    + e.getMessage());

            return false;
        }
    }
    
}
