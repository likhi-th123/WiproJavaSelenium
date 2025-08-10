package assessment;

class BankAccountTran {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        String user = Thread.currentThread().getName();
        System.out.println(user + " is trying to withdraw " + amount);

        if (balance >= amount) {
            System.out.println(user + ": Transaction approved.");
            balance -= amount;
            System.out.println(user + ": Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println(user + ": Not enough balance. Current balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class BankAtm {
    public static void main(String[] args) {
        BankAccountTran account = new BankAccountTran(); // ✅ Corrected class name

        Runnable task = () -> account.withdraw(1000);

        Thread u1 = new Thread(task, "User1");
        Thread u2 = new Thread(task, "User2");

        u1.start();
        u2.start();

        try {
            u1.join();
            u2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Account Balance: " + account.getBalance());
    }
}
