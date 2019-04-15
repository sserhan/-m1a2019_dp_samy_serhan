package Visitor.commandes.main;

import Visitor.commandes.contrat.*;
import Visitor.commandes.model.*;

import java.util.Iterator;

/**
 * classe main va créer un groupe de client auxquels on associe des commandes
 * Puis création d'un rapport de Commande qui va parcourir le groupe de client
 */
public class Main {
    public static void main (String [] args){
        Ligne ligne = new Ligne("Ligne 1");

        Commande commande = new Commande("Commande S", ligne.getName());
        commande.addLigne(new Ligne("Ligne 2"));
        Commande commande2 = new Commande("Commande B",ligne.getName());

        Client client = new Client("Samy");
        Client client2 = new Client("Zak");
        client.addComande(commande);
        client2.addComande(commande);
        client2.addComande(commande2);

        GroupeClient groupeClient = new GroupeClient("groupe1");
        groupeClient.addClient(client);
        groupeClient.addClient(client2);

        IVisitor rapport = new RapportCommande();

        groupeClient.accept(rapport);

        rapport.afficherCommandes();
    }
}
