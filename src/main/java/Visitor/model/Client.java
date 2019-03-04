package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client implements IVisitable {
    private String name;
    private List<Commande> commandeList = new ArrayList<Commande>();

    public Client(String name) {
        this.name = name;
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void addComande(Commande c){
        commandeList.add(c);
    }

    @Override
    public String toString() {
        return "Element de type Client";
    }
}
