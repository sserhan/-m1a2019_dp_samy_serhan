package Visitor.commandes.model;

import Visitor.commandes.contrat.IVisitable;
import Visitor.commandes.contrat.IVisitor;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class GroupeClient implements IVisitable {
    private List<Client> clientList = new ArrayList<Client>();
    private String name;

    public GroupeClient(String name) {
        this.name = name;
    }

    public void accept(IVisitor visitor) {
        for(Client c : clientList){
            c.accept(visitor);
        }
    }

    public Iterator<Client> iterator(){
        return this.clientList.iterator();
    }

    public String getName() {
        return name;
    }

    public void addClient(Client c){
        clientList.add(c);
    }
}
