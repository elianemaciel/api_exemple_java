package com.example.payment.dto;

import com.example.payment.model.Payment;

public class PaymentDTO {
    private String id;
    private double amount;
    private String description;

    public PaymentDTO(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public PaymentDTO(Payment payment) {
        this(payment.getAmount(), payment.getDescription());
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
