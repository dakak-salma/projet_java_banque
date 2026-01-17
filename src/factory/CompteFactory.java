package factory;

import model.*;

public class CompteFactory {

    public static Compte creerCompte(String type, String num, double solde) {
        switch (type) {
            case "COURANT":
                return new CompteCourant(num, solde, 1000);
            case "EPARGNE":
                return new CompteEpargne(num, solde, 0.03);
            case "ENTREPRISE":
                return new CompteEntreprise(num, solde, 50000);
            default:
                throw new IllegalArgumentException("Type de compte inconnu");
        }
    }
}

