package main;

import factory.CompteFactory;
import model.*;
import exceptions.*;

public class CompteTest {

    public static void main(String[] args) {

        System.out.println("=== Création des clients et comptes ===");
        Client client = new Client("Salma", "DK", "AA12345", "Rabat");

        Compte courant = CompteFactory.creerCompte("COURANT", "C001", 2000);
        Compte epargne = CompteFactory.creerCompte("EPARGNE", "E001", 5000);
        Compte entreprise = CompteFactory.creerCompte("ENTREPRISE", "ENT001", 100000);

        client.ajouterCompte(courant);
        client.ajouterCompte(epargne);
        client.ajouterCompte(entreprise);

        System.out.println("\n=== Dépôts ===");
        courant.deposer(500);
        epargne.deposer(1000);
        entreprise.deposer(20000);

        System.out.println("\n=== Retraits ===");
        try {
            courant.retirer(3000); // risque découvert
        } catch (SoldeInsuffisantException ex) {
            System.out.println("Erreur compte courant : " + ex.getMessage());
        }

        try {
            entreprise.retirer(60000); // dépasse plafond
        } catch (LimiteDepasseeException ex) {
            System.out.println("Erreur compte entreprise : " + ex.getMessage());
        }

        System.out.println("\n=== Intérêts sur compte épargne ===");
        ((CompteEpargne) epargne).calculerInteret();

        System.out.println("\n=== Solde final des comptes ===");
        client.afficherComptes();

        System.out.println("\n=== Historique compte courant ===");
        courant.afficherTransactions();

        System.out.println("\n=== Historique compte épargne ===");
        epargne.afficherTransactions();

        System.out.println("\n=== Historique compte entreprise ===");
        entreprise.afficherTransactions();

        System.out.println("\n=== Test dépôt négatif ===");
        try {
            courant.deposer(-100);
        } catch (MontantInvalideException ex) {
            System.out.println("Erreur dépôt : " + ex.getMessage());
        }

        System.out.println("\n=== Test solde initial négatif ===");
        try {
            Compte mauvaisCompte = CompteFactory.creerCompte("COURANT", "C002", -500);
        } catch (MontantInvalideException ex) {
            System.out.println("Erreur création compte : " + ex.getMessage());
        }
    }
}
