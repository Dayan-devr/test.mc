/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.PatientDAO;
import Model.Patient;

import java.util.List;

/**
 *
 * @author USER
 */
public class PatientController {

    private final PatientDAO patientDAO;

    public PatientController() {
        patientDAO = new PatientDAO();
    }

    // Add patient
    public boolean addPatient(String name, String address,
                              String contactNumber) {

        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        if (address == null || address.trim().isEmpty()) {
            return false;
        }

        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            return false;
        }

        Patient patient = new Patient();

        patient.setPatientName(name.trim());
        patient.setAddress(address.trim());
        patient.setContactNumber(contactNumber.trim());

        return patientDAO.addPatient(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return patientDAO.getAllPatients();
    }

    // Search patients
    public List<Patient> searchPatients(String name) {

        if (name == null) {
            name = "";
        }

        return patientDAO.searchPatients(name.trim());
    }

    // Update patient
    public boolean updatePatient(int patientId,
                                 String name,
                                 String address,
                                 String contactNumber) {

        if (patientId <= 0) {
            return false;
        }

        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        if (address == null || address.trim().isEmpty()) {
            return false;
        }

        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            return false;
        }

        Patient patient = new Patient();

        patient.setPatientId(patientId);
        patient.setPatientName(name.trim());
        patient.setAddress(address.trim());
        patient.setContactNumber(contactNumber.trim());

        return patientDAO.updatePatient(patient);
    }

    // Delete patient
    public boolean deletePatient(int patientId) {

        if (patientId <= 0) {
            return false;
        }

        return patientDAO.deletePatient(patientId);
    }
}