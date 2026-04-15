package DynamicOnlineMarketplace;

import java.util.*;

class Marketplace {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product<?> p : products) {
            System.out.println(p);
        }
    }

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(newPrice);
    }
}