package Visitor.tree.modele;

import Visitor.tree.contrat.ComposantIntf;

import java.util.Objects;
import java.util.Set;

public abstract class Composant implements ComposantIntf {

    int value;

    public Composant(int value) {
        this.value = value;
    }
    @Override
    public int getValue() {
        return value;
    }
    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public abstract boolean addNode(Composant node);
    public abstract boolean removeNode(Composant node);
    public abstract Set<Composant> getChildren();

    public abstract boolean isNode();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composant composant = (Composant) o;
        return value == composant.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
