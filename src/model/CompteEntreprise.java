package model;

import exceptions.LimiteDepasseeException;
import exceptions.SoldeInsuffisantException;

public class CompteEntreprise extends Compte {
    private double plafond;

    public CompteEntreprise(String num, double solde, double plafond) {
        super(num, solde);
        this.plafond = plafond;
    }

    @Override
    public void retirer(double montant) {
        if (montant > plafond)
            throw new LimiteDepasseeException();
        if (montant > solde)
            throw new SoldeInsuffisantException();
        solde -= montant;
        transactions.add(new Transaction("RETRAIT", montant));
    }
}

