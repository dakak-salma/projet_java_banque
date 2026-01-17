package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom, prenom, cin, adresse;
    private List<Compte> comptes;

    public Client(String nom, String prenom, String cin, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.comptes = new ArrayList<>();
    }

    public void ajouterCompte(Compte compte) {
        comptes.add(compte);
    }

    public void afficherComptes() {
        comptes.forEach(c ->
                System.out.println("Compte : " + c.getClass().getSimpleName() +
                        " | Solde : " + c.getSolde()));
    }
}

