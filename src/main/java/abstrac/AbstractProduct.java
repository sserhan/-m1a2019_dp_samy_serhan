package abstrac;

import interfac.Product;

public abstract class AbstractProduct implements Product {
    public abstract Product createProduct();

    public abstract void foo();
}
