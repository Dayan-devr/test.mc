/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class Treatment {
    
     private int treatmentId;
    private String treatmentName;
    private String description;
    private double treatmentCost;
    private double consultationFee;

    // Default constructor
    public Treatment() {
    }

    // Parameterized constructor
    public Treatment(int treatmentId, String treatmentName,
                     String description, double treatmentCost,
                     double consultationFee) {
        this.treatmentId = treatmentId;
        this.treatmentName = treatmentName;
        this.description = description;
        this.treatmentCost = treatmentCost;
        this.consultationFee = consultationFee;
    }

    // Getters and Setters
    public int getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(int treatmentId) {
        this.treatmentId = treatmentId;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(double treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    // Calculate total cost
    public double calculateTotalCost() {
        return treatmentCost + consultationFee;
    }

    @Override
    public String toString() {
        return "Treatment{"
                + "treatmentId=" + treatmentId
                + ", treatmentName='" + treatmentName + '\''
                + ", description='" + description + '\''
                + ", treatmentCost=" + treatmentCost
                + ", consultationFee=" + consultationFee
                + '}';
    }
    
}
