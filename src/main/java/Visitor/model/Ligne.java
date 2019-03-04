package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;

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
        return "Element de type Ligne";
    }
}
