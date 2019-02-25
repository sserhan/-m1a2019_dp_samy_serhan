package model;

import Factory.ProductFactory;
import abstrac.AbstractProduct;
import interfac.Product;

public final class ProductC extends AbstractProduct {
    static{
        ProductFactory.registryProduct("ProductC",new ProductC());
    }

    protected AbstractProduct createProduct() {
        return new ProductC();
    }

    public void perform() {
        System.out.println(" I ’m a ProductC , performing ");
    }

    public void foo() {
        this.perform();
    }
}
