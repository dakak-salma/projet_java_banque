
package model;

import exceptions.SoldeInsuffisantException;

public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(String num, double solde, double decouvert) {
        super(num, solde);
        this.decouvertAutorise = decouvert;
    }

    @Override
    public void retirer(double montant) {
        if (solde - montant < -decouvertAutorise)
            throw new SoldeInsuffisantException();
        solde -= montant;
        transactions.add(new Transaction("RETRAIT", montant));
    }
}
