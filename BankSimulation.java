class BankAccount {
    String accountHolder;
    String accountType;

    BankAccount(String name, String type) {
        accountHolder = name;
        accountType = type;
    }
}

class UserThread implements Runnable {
    BankAccount account;

    UserThread(BankAccount acc) {
        account = acc;
    }

    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 3; i++) {
            System.out.println("User: " + account.accountHolder +
                    " | Type: " + account.accountType +
                    " | Priority: " + t.getPriority() +
                    " | Checking balance... (" + i + ")");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        BankAccount premium = new BankAccount("Aman", "Premium");
        BankAccount regular = new BankAccount("Riya", "Regular");
        BankAccount basic = new BankAccount("Rahul", "Basic");

        Thread t1 = new Thread(new UserThread(premium));
        Thread t2 = new Thread(new UserThread(regular));
        Thread t3 = new Thread(new UserThread(basic));

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}