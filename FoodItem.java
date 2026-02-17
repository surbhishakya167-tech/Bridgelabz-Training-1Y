interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    public double calculateTotalPrice() { return price * quantity; }
    public double applyDiscount() { return 50; }
    public String getDiscountDetails() { return "Flat 50 off"; }
}
