package FactorySingleton.abstractclass;

import FactorySingleton.contrat.Product;

/**
 * Classe Abstraite qui sera utilisé dans le Factory
 */

public abstract class AbstractProduct implements Product {
    public abstract Product createProduct();

    public abstract void foo();
}
