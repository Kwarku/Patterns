package pl.narodzinyprogramisty.ChainOfResponibility;

import java.util.List;
import java.util.Map;

public abstract class Shop {

    private String shopName;
    private List<String> products;
    private Shop successor;

    public Shop(String shopName, List<String> products, Shop successor) {
        this.shopName = shopName;
        this.products = products;
        this.successor = successor;
    }

    protected boolean isProductAvailable(String productName) {
        for (String product : products) {
            if (product.equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public void buy(String product) {
        if (isProductAvailable(product)) {
            System.out.println("Product : " + product + " was buy in : " + shopName);
        } else if (successor != null) {
            successor.buy(product);
        }else {
            System.out.println("Product not available!");
        }
    }
}
