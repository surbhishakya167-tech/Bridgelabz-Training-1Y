class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemCode = 201;
        item1.itemName = "Notebook";
        item1.price = 50;
        item1.displayDetails();
        System.out.println("Total Cost for 5 items: " + item1.calculateTotalCost(5));
    }
}
