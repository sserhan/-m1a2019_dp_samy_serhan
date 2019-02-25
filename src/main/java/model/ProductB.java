package model;

import Factory.ProductFactory;
import abstrac.AbstractProduct;
import interfac.Product;

public final class ProductB extends AbstractProduct {
    static{
        ProductFactory.registryProduct("ProductB",new ProductB());
    }

    protected AbstractProduct createProduct() {
        return new ProductB();
    }

    public void doIt(){
        System.out.println("I ’m a ProductB , doing it");
    }

    public void foo() {
        this.doIt();
    }
}
