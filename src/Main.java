
import factory.CompteFactory;
import model.*;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Salma", "dakak", "AA12345", "EL JADIDA");

        Compte c1 = CompteFactory.creerCompte("COURANT", "C001", 2000);
        Compte c2 = CompteFactory.creerCompte("EPARGNE", "E001", 5000);

        client.ajouterCompte(c1);
        client.ajouterCompte(c2);

        c1.deposer(500);
        c1.retirer(1000);

        ((CompteEpargne) c2).calculerInteret();

        client.afficherComptes();

        System.out.println("\nHistorique Compte Courant :");
        c1.afficherTransactions();
    }
}
