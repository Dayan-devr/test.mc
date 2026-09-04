/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class Patient {
    
    private int patientId;
    private String patientName;
    private String address;
    private String contactNumber;

    // Default constructor
    public Patient() {
    }

    // Parameterized constructor
    public Patient(int patientId, String patientName,
                   String address, String contactNumber) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Patient{"
                + "patientId=" + patientId
                + ", patientName='" + patientName + '\''
                + ", address='" + address + '\''
                + ", contactNumber='" + contactNumber + '\''
                + '}';
    }
    
}
