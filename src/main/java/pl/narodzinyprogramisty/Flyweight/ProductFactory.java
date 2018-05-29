package pl.narodzinyprogramisty.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {
    private List<Product> products;

    public ProductFactory() {
        this.products = new ArrayList<>();
    }

    public Product produce(String name, float price) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getPrice() == price) {
                return product;
            }
        }
        Product product = new Product(name, price);
        products.add(product);
        return product;
    }

    public int getListSize(){
        return products.size();
    }

}
