package Visitor.model;

import Visitor.contrat.IVisitable;
import Visitor.contrat.IVisitor;


import java.util.ArrayList;
import java.util.List;

public class GroupeClient implements IVisitable {
    private List<Client> clientList = new ArrayList<Client>();
    private String name;

    public GroupeClient(String name) {
        this.name = name;
    }

    public void accept(IVisitor visitor) {
        for(Client c : clientList){
            visitor.visit(c);
        }
    }

    public String getName() {
        return name;
    }

    public void addClient(Client c){
        clientList.add(c);
    }
}
