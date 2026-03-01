public class PaymentApp {
    public static void main(String[] args) {

        PaymentProcessor processor = new PayPalProcessor();
        processor.processPayment(1000);
        processor.refund(500);
    }
}