package Visitor.tree.contrat;

import Visitor.tree.modele.Composant;

import java.util.Set;

/**
 * Interface d'un Composant (servira pour contstruire nos arbres
 */
public interface ComposantIntf {
    int getValue();
    void setValue(int value);
    boolean addNode(Composant node);
    boolean removeNode(Composant node);
    Set<Composant> getChildren();
    boolean isNode();
}
