package Visitor.tree.modele;

import Visitor.tree.contrat.ComposantIntf;
import Visitor.tree.contrat.ITreeVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class VisitorTreeLargeur implements ITreeVisitor {

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
}
