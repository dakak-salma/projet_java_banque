package model;

import exceptions.MontantInvalideException;
import java.util.ArrayList;
import java.util.List;

public abstract class Compte {
    protected String numero;
    protected double solde;
    protected List<Transaction> transactions;

    public Compte(String numero, double soldeInitial) {
        if (soldeInitial < 0)
            throw new MontantInvalideException();
        this.numero = numero;
        this.solde = soldeInitial;
        this.transactions = new ArrayList<>();
    }

    public void deposer(double montant) {
        if (montant <= 0)
            throw new MontantInvalideException();
        solde += montant;
        transactions.add(new Transaction("DEPOT", montant));
    }

    public abstract void retirer(double montant);

    public double getSolde() {
        return solde;
    }

    public void afficherTransactions() {
        transactions.forEach(System.out::println);
    }
}
