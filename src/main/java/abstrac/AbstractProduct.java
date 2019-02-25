package abstrac;

import interfac.Product;

public abstract class AbstractProduct implements Product {
    protected abstract AbstractProduct createProduct();

    public abstract void foo();
}
