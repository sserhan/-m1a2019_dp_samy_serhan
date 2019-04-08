package Visitor.commandes.model;

import Visitor.commandes.contrat.IVisitable;
import Visitor.commandes.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Commande implements IVisitable {
    private String name;
    private List<Ligne> ligneList = new ArrayList<Ligne>();

    public Commande(String name) {
        this.name = name;
    }

    public Commande(String name, String ligneName) {
        this.name = name;
        this.ligneList.add(new Ligne(ligneName));
    }

    public void accept(IVisitor visitor) {
        ligneList.forEach(l -> l.accept(visitor));
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public List<Ligne> getLigneList() {
        return ligneList;
    }

    public void addLigne(Ligne l){
        ligneList.add(l);
    }

    @Override
    public String toString() {
        return "Commande : " + getName();
    }
}
