class BankAccount {
    int accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int depositPeriod;

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

public class BankTest {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 101;
        s.balance = 5000;
        s.interestRate = 5.5;

        s.displayAccountType();
        System.out.println("Account Number: " + s.accountNumber);
        System.out.println("Balance: " + s.balance);
        System.out.println("Interest Rate: " + s.interestRate);

        System.out.println("------------");

        CheckingAccount c = new CheckingAccount();
        c.accountNumber = 102;
        c.balance = 8000;
        c.withdrawalLimit = 2000;

        c.displayAccountType();
        System.out.println("Account Number: " + c.accountNumber);
        System.out.println("Balance: " + c.balance);
        System.out.println("Withdrawal Limit: " + c.withdrawalLimit);
    }
}
