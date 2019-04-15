package Visitor.tree.modele;

import Visitor.tree.contrat.ComposantIntf;
import Visitor.tree.contrat.ITreeVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implémentation d'un visiteur d'arbre qui parcourt en largeur
 */
public final class VisitorTreeLargeur implements ITreeVisitor {

    private boolean first = false;

    @Override
    public ComposantIntf visitTree(ComposantIntf t, List<ComposantIntf> trees, int i) {
        ComposantIntf comp = null;
        System.out.println("VALEUR : " + t.getValue());
        if(i == t.getValue()){
            System.out.println("Valeur trouvé ! ");
            return t;
        }
        for(ComposantIntf c : trees){
            if(c.getValue() == i){
                System.out.println("Valeur trouvé ! ");
                return c;
            }
            if(c.isNode()){
                ComposantIntf visit = visitTree(c,new ArrayList<>(c.getChildren()),i);
                if(visit != null) comp=visit;
            }
        }
        return comp;
    }

    @Override
    public void visitPartition(ComposantIntf t, List<ComposantIntf> trees, List<ComposantIntf> pairs, List<ComposantIntf> impairs) {
        if(pairs.isEmpty() && impairs.isEmpty()){
            if (t.getValue() % 2 == 0) {
                pairs.add(t);
            } else {
                impairs.add(t);
            }
            first = true;
        }
        if(t.isNode()) {
            t.getChildren().forEach(c -> {
                if (c.getValue() % 2 == 0)
                    pairs.add(c);
                else
                    impairs.add(c);
            });
            t.getChildren().forEach(c -> visitPartition(c,
                    c.isNode()?new ArrayList<>(c.getChildren()):null,pairs,impairs));
        }
    }
}


