package Visitor.contrat;

import Visitor.model.Client;
import Visitor.model.Commande;
import Visitor.model.Ligne;

public interface IVisitor {
    void visit(Client c);
    void visit(Commande o);
    void visit(Ligne l);
    void afficherCommandes();
}
