package FactorySingleton.model;

import FactorySingleton.Factory.ProductFactory;
import FactorySingleton.abstractclass.AbstractProduct;

public final class ProductA extends AbstractProduct {
    static{
        ProductFactory.registryProduct("ProductA",new ProductA());
    }

    public AbstractProduct createProduct() {
        return new ProductA();
    }

    private static void doYourStuff(){
        System.out.println(" I ’m a ProductA , doing my stuff ");
    }

    public void foo(){
        doYourStuff();
    }
}
