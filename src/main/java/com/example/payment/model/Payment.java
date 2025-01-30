package com.example.payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "payments")
public
class Payment {
    @Id
    private String id;
    private double amount;
    private String description;

    public Payment() {}

    public Payment(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}