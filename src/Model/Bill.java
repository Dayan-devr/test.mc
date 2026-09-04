/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;


/**
 *
 * @author USER
 */
public class Bill {
    
     private int billId;
    private String billNumber;
    private Appointment appointment;
    private double treatmentCost;
    private double consultationFee;
    private double totalAmount;
    private LocalDate billDate;
    private String paymentStatus;

    // Default constructor
    public Bill() {
    }

    // Parameterized constructor
    public Bill(int billId,
                String billNumber,
                Appointment appointment,
                double treatmentCost,
                double consultationFee,
                LocalDate billDate,
                String paymentStatus) {

        this.billId = billId;
        this.billNumber = billNumber;
        this.appointment = appointment;
        this.treatmentCost = treatmentCost;
        this.consultationFee = consultationFee;
        this.billDate = billDate;
        this.paymentStatus = paymentStatus;

        calculateTotalAmount();
    }

    // Calculate total bill amount
    public void calculateTotalAmount() {
        this.totalAmount = treatmentCost + consultationFee;
    }

    // Getters and Setters

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(double treatmentCost) {
        this.treatmentCost = treatmentCost;
        calculateTotalAmount();
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
        calculateTotalAmount();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public LocalDate getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Bill{"
                + "billId=" + billId
                + ", billNumber='" + billNumber + '\''
                + ", treatmentCost=" + treatmentCost
                + ", consultationFee=" + consultationFee
                + ", totalAmount=" + totalAmount
                + ", billDate=" + billDate
                + ", paymentStatus='" + paymentStatus + '\''
                + '}';
    }
    
}
