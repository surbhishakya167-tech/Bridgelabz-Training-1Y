package DynamicOnlineMarketplace;

public class Main {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Shirt", 1000, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Mobile", 20000, new GadgetCategory());

        Marketplace marketplace = new Marketplace();

        marketplace.addProduct(book);
        marketplace.addProduct(shirt);
        marketplace.addProduct(phone);

        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(phone, 5);

        marketplace.displayProducts();
    }
}