package CustomSorting;
import java.util.*;

public class ECommerceSortingSystem {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 80000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.7, 15));
        products.add(new Product("Headphones", 2000, 4.2, 20));

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        display(products);

        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        display(products);

        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        display(products);
    }

    public static void display(List<Product> products) {
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();
    }
}