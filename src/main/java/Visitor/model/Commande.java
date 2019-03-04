package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;

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
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void addLigne(Ligne l){
        ligneList.add(l);
    }

    @Override
    public String toString() {
        return "Element de type Commande";
    }
}
