package model;

import Factory.ProductFactory;
import abstrac.AbstractProduct;
import interfac.Product;

public final class ProductA extends AbstractProduct {
    static{
        ProductFactory.registryProduct("ProductA",new ProductA());
    }

    protected AbstractProduct createProduct() {
        return new ProductA();
    }

    public void doYourStuff(){
        System.out.println(" I ’m a ProductA , doing my stuff ");
    }

    public void foo(){
        this.doYourStuff();
    }
}
