/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class Dentist {
     private int dentistId;
    private String dentistName;
    private String specialization;
    private String contactNumber;

    // Default constructor
    public Dentist() {
    }

    // Parameterized constructor
    public Dentist(int dentistId, String dentistName,
                   String specialization, String contactNumber) {
        this.dentistId = dentistId;
        this.dentistName = dentistName;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public int getDentistId() {
        return dentistId;
    }

    public void setDentistId(int dentistId) {
        this.dentistId = dentistId;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Dentist{"
                + "dentistId=" + dentistId
                + ", dentistName='" + dentistName + '\''
                + ", specialization='" + specialization + '\''
                + ", contactNumber='" + contactNumber + '\''
                + '}';
    }
    
}
