public class StripeProcessor implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Stripe.");
    }
}