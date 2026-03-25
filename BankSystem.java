class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super();
    }
}

public class BankSystem {

    double balance = 1000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {
        BankSystem obj = new BankSystem();

        try {
            obj.withdraw(500);
        }

        catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        }

        catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}