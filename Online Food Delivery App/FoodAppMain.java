class FoodAppMain {
    public static void main(String[] args) {

        Order o1 = new RegularOrder(1, 500);
        Order o2 = new PremiumOrder(2, 500);

        System.out.println(o1.calculateBill());
        System.out.println(o2.calculateBill());
    }
}