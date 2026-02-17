interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount implements Loanable {
    private int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    public double calculateInterest() { return balance * 0.04; }

    public void applyForLoan(double amount) {}
    public boolean calculateLoanEligibility() { return balance > 10000; }
}
