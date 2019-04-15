package Visitor.tree.modele;

import Visitor.tree.contrat.ITreeVisitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTreeProfondeur implements ITreeVisitor {

    @Override
    public Composant visitTree(Composant t, List<Composant> trees, int i) {
        Composant comp = null;
        System.out.println("VALEUR : " + t.getValue());
        if(i == t.getValue()){
            System.out.println("Valeur trouvé ! ");
            return t;
        }
        if(t.isNode()){
            for(Composant c : trees){
                Composant visit = visitTree(c,c.isNode()? new ArrayList<Composant>(c.getChildren()) : null,i);
                if(visit != null) comp = visit;
            }
        }
        return comp;
    }
}