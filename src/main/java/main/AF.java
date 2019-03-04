package main;

import Factory.ProductFactory;
import model.Client;

public final class AF {
    static {
        try{
            Class.forName("model.ProductA");
            Class.forName("model.ProductB");
            Class.forName("model.ProductC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        Client myClient = new Client();
        ProductFactory instance = ProductFactory.getInstance();
        myClient.foo();
    }
}
