package model;

import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime date;
    private String type;
    private double montant;

    public Transaction(String type, double montant) {
        this.date = LocalDateTime.now();
        this.type = type;
        this.montant = montant;
    }

    @Override
    public String toString() {
        return date + " | " + type + " | " + montant;
    }
}

