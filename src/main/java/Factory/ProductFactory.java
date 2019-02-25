package Factory;

import abstrac.AbstractProduct;
import interfac.Product;

import java.util.HashMap;
import java.util.Map;

public final class ProductFactory {
    private static Map<String, Product> registry = new HashMap<String, Product>();

    public static void registryProduct(String name, Product p){
        registry.put(name,p);
    }

    public AbstractProduct createProduct(String name){
                return (AbstractProduct) registry.get(name).createProduct();
    }
}
