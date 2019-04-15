package Visitor.tree.modele;

import Visitor.tree.contrat.ComposantIntf;
import Visitor.tree.contrat.ITreeVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation d'un visiteur d'arbre qui parcourt en profondeur
 */
public class VisitorTreeProfondeur implements ITreeVisitor {

    @Override
    public ComposantIntf visitTree(ComposantIntf t, List<ComposantIntf> trees, int i) {
        ComposantIntf comp = null;
        System.out.println("VALEUR : " + t.getValue());
        if(i == t.getValue()){
            System.out.println("Valeur trouvé ! ");
            return t;
        }
        if(t.isNode()){
            for(ComposantIntf c : trees){
                ComposantIntf visit = visitTree(c,c.isNode()? new ArrayList<ComposantIntf>(c.getChildren()) : null,i);
                if(visit != null) comp = visit;
            }
        }
        return comp;
    }

    @Override
    public void visitPartition(ComposantIntf t, List<ComposantIntf> trees, List<ComposantIntf> pairs, List<ComposantIntf> impairs) {
        if (t.getValue() % 2 == 0) {
            pairs.add(t);
        } else {
            impairs.add(t);
        }
        if(t.isNode()){
            trees.forEach(composant -> visitPartition(composant,
                    composant.isNode()?new ArrayList<>(composant.getChildren()):null,pairs,impairs));
        }
    }
}