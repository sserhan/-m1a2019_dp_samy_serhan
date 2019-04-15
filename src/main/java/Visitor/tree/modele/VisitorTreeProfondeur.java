package Visitor.tree.modele;

import Visitor.tree.contrat.ComposantIntf;
import Visitor.tree.contrat.ITreeVisitor;

import java.util.ArrayList;
import java.util.List;

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
}