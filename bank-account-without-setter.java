class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    // Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("ACC101", 5000);

       System.out.println("Balance: " + account.getBalance());
        account.deposit(2000);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(1500);
        System.out.println("Balance: " + account.getBalance());
    }
}