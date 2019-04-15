package Visitor.tree.modele;

import java.util.Set;

public final class Leaf extends Composant {
    public Leaf(int value) {
        super(value);
    }

    @Override
    public boolean addNode(Composant node) {
        throw new UnsupportedOperationException("Leaf does not support composite operations");
    }

    @Override
    public boolean removeNode(Composant node) {
        throw new UnsupportedOperationException("Leaf does not support composite operations");
    }

    @Override
    public Set<Composant> getChildren() {
        throw new UnsupportedOperationException("Leaf does not support composite operations");
    }

    @Override
    public boolean isNode() {
        return false;
    }
}
