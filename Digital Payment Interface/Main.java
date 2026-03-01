public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay(1000);
        p2.pay(2500);
        p3.pay(500);
    }
}