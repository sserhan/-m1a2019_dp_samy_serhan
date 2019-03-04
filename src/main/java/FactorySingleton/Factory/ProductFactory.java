package FactorySingleton.Factory;

import FactorySingleton.abstractclass.AbstractProduct;
import FactorySingleton.contrat.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Implémentarion du DP Factory qui permet de créer un récupérer des Produits.
 */

public final class ProductFactory {
    private static Map<String, Product> registry = new HashMap<String, Product>();
    private static volatile ProductFactory instance = null;

    /**
     * Implémentation du Singleton sur le factory Registry
     */
    public static ProductFactory getInstance() {
        ProductFactory result = instance;
        if (result == null) {
            synchronized (ProductFactory.class) {
                result = instance;
                if (result == null) {
                    instance = new ProductFactory();
                }
            }
        }
        return instance;
    }

    public AbstractProduct createProduct(String name){
                return (AbstractProduct) registry.get(name).createProduct();
    }

    public static void registryProduct(String name, Product p){
        registry.put(name,p);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
