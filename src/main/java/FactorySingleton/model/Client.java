package FactorySingleton.model;

import FactorySingleton.contrat.Product;

import java.util.List;

/**
 * Classe Cleint qui va exécuter
 */

public final class Client {

    private static ProductA prodA;
    private static ProductB prodB;

    public Client(){
        prodA = new ProductA();
    }

    public void foo(List<Product> listProduct){
        for(Product p : listProduct){
            p.foo();
        }
    }
}
