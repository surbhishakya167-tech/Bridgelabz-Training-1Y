package LogisticCompany;
public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1", "Kavita");

        d.route.add(new Delivery("Warehouse", 30, 40, 50));
        d.route.add(new Fuel("Pump", 20, 15, 20));
        d.route.add(new Rest("Hotel", 10, 20, 60));

        d.show();
    }
}