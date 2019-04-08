package Visitor.commandes.model;

import Visitor.commandes.contrat.IVisitable;
import Visitor.commandes.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client implements IVisitable {
    private String name;
    private List<Commande> commandeList = new ArrayList<Commande>();

    public Client(String name) {
        this.name = name;
    }

    public void accept(IVisitor visitor) {
        commandeList.forEach(c -> c.accept(visitor));
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void addComande(Commande c){
        commandeList.add(c);
    }

    public List<Commande> getCommandeList() {
        return commandeList;
    }

    @Override
    public String toString() {
        return "Client : " + this.getName();
    }
}
