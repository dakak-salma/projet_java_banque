
package model;

import exceptions.SoldeInsuffisantException;
import interfaces.CalculInteret;

public class CompteEpargne extends Compte implements CalculInteret {
    private double tauxInteret;

    public CompteEpargne(String num, double solde, double taux) {
        super(num, solde);
        this.tauxInteret = taux;
    }

    @Override
    public void retirer(double montant) {
        if (montant > solde)
            throw new SoldeInsuffisantException();
        solde -= montant;
        transactions.add(new Transaction("RETRAIT", montant));
    }

    @Override
    public void calculerInteret() {
        double interet = solde * tauxInteret;
        solde += interet;
        transactions.add(new Transaction("INTERET", interet));
    }
}
