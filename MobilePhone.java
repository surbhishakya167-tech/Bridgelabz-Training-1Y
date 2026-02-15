class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S23";
        phone1.price = 75000;
        phone1.displayDetails();
    }
}
