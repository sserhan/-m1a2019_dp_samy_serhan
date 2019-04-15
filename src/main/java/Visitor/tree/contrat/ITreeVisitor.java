package Visitor.tree.contrat;

import java.util.List;

/**
 * Interface du visiteur d'arbre
 */
public interface ITreeVisitor {
    ComposantIntf visitTree (ComposantIntf t, List<ComposantIntf> trees, int i);
    void  visitPartition(ComposantIntf t, List<ComposantIntf> trees, List<ComposantIntf> pairs, List<ComposantIntf> impairs);
}
