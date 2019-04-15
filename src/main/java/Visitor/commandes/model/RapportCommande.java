package Visitor.commandes.model;

import Visitor.commandes.contrat.IVisitable;
import Visitor.commandes.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implémentation du Visiteur Rapport Commande.
 */
public final class RapportCommande implements IVisitor {
    private List<Client> clientVisite = new ArrayList<>();

    public void visit(Client c) {
        clientVisite.add(c);
        System.out.println("Rapport de Commande : " + c.toString());
    }

    public void visit(Commande o) {
        System.out.println("Rapport de Commande : " + o.toString());
    }

    public void visit(Ligne l) {
        System.out.println("Rapport de Commande : " + l.toString());
    }

    public void afficherCommandes() {
        System.out.println("DEBUT DU RAPPORT : ");
        clientVisite.forEach(client -> {
            System.out.println(client.toString());
            client.getCommandeList().forEach(commande -> {
                System.out.println(commande.toString());
                commande.getLigneList().forEach(System.out::println);
            });
        });
    }
}
