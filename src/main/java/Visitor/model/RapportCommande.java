package Visitor.model;

import Visitor.contrat.IVisitor;

public class RapportCommande implements IVisitor {
    public void visit(Client c) {
        System.out.println("Rapport de Commande : " + c.toString());
    }

    public void visit(Commande o) {
        System.out.println("Rapport de Commande : " + o.toString());
    }

    public void visit(Ligne l) {
        System.out.println("Rapport de Commande : " + l.toString());
    }

    public void afficherCommandes() {

    }
}
