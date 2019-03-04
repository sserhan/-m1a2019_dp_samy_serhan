package FactorySingleton.model;

import FactorySingleton.Factory.ProductFactory;
import FactorySingleton.abstractclass.AbstractProduct;

public final class ProductC extends AbstractProduct {
    static{
        ProductFactory.registryProduct("ProductC",new ProductC());
    }

    public AbstractProduct createProduct() {
        return new ProductC();
    }

    private static void perform() {
        System.out.println(" I ’m a ProductC , performing ");
    }

    public void foo() {
        perform();
    }
}
