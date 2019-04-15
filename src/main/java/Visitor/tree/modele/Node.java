package Visitor.tree.modele;

import java.util.HashSet;
import java.util.Set;

public final class Node extends Composant {

    private Set composants=new HashSet();

    public Node(int value) {
        super(value);
    }

    @Override
    public boolean addNode(Composant node) {
        return this.composants.add(node);
    }

    @Override
    public boolean removeNode(Composant node) {
        return this.composants.remove(node);
    }

    @Override
    public Set<Composant> getChildren() {
        return this.composants;
    }

    @Override
    public boolean isNode() {
        return true;
    }
}
