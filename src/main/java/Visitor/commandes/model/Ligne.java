package Visitor.commandes.model;

import Visitor.commandes.contrat.IVisitable;
import Visitor.commandes.contrat.IVisitor;

public class Ligne implements IVisitable {
    private String name;

    public Ligne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Ligne : " + getName();
    }
}
