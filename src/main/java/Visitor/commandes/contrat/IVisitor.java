package Visitor.commandes.contrat;

import Visitor.commandes.model.Client;
import Visitor.commandes.model.Commande;
import Visitor.commandes.model.Ligne;

public interface IVisitor {
    void visit(Client c);
    void visit(Commande o);
    void visit(Ligne l);
    void afficherCommandes();
}
