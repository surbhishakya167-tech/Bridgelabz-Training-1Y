public class CustomerData implements Sensitive {

    private String accountNumber;
    private double balance;

    public CustomerData(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "Account: " + accountNumber + ", Balance: " + balance;
    }
}