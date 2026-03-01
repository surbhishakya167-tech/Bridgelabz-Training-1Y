public class CloneApp {

    public static void main(String[] args) throws Exception {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = (Product) p1.clone();

        System.out.println(p1);
        System.out.println(p2);
    }
}