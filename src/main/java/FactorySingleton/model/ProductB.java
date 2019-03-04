package FactorySingleton.model;

import FactorySingleton.Factory.ProductFactory;
import FactorySingleton.abstractclass.AbstractProduct;

public final class ProductB extends AbstractProduct {
    static{
        ProductFactory.registryProduct("ProductB",new ProductB());
    }

    public AbstractProduct createProduct() {
        return new ProductB();
    }

    private static void doIt(){
        System.out.println("I ’m a ProductB , doing it");
    }

    public void foo() {
        doIt();
    }
}
