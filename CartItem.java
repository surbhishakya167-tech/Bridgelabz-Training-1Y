class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem(int q) {
        if (q <= quantity)
            quantity -= q;
    }

    void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.addItem("Pen", 20, 5);
        item.removeItem(2);
        item.displayTotalCost();
    }
}
