package FactorySingleton.contrat;

/**
 *  Interface de Produit
 */

public interface Product {
    Product createProduct();
    void foo();
}
