public class EncryptionApp {

    public static void main(String[] args) {

        CustomerData customer = new CustomerData("ACC12345", 10000);

        if (customer instanceof Sensitive) {
            System.out.println("Encrypting sensitive data...");
        }

        System.out.println(customer);
    }
}