package FactorySingleton.main;

import FactorySingleton.Factory.ProductFactory;
import FactorySingleton.contrat.Product;
import FactorySingleton.model.Client;

import java.util.ArrayList;
import java.util.List;

public final class AF {
    static {
        try{
            Class.forName("FactorySingleton.model.ProductA");
            Class.forName("FactorySingleton.model.ProductB");
            Class.forName("FactorySingleton.model.ProductC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        Client myClient = new Client();
        ProductFactory instance = ProductFactory.getInstance();
        List<Product> listProduct = new ArrayList<Product>();
        listProduct.add(instance.createProduct("ProductA"));
        listProduct.add(instance.createProduct("ProductB"));
        listProduct.add(instance.createProduct("ProductC"));
        myClient.foo(listProduct);
    }
}
