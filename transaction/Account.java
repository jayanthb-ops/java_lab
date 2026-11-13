package transaction;

public class Account {

    private int accountNumber;
    private double balance;

    String[] transactions = new String[100];
    int count = 0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;

            transactions[count] = "Deposited: Rs. " + amount
                    + " | Balance: Rs. " + balance;
            count++;

            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;

            transactions[count] = "Withdrawn: Rs. " + amount
                    + " | Balance: Rs. " + balance;
            count++;

            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void displayTransactions() {
        for (int i = 0; i < count; i++) {
            System.out.println(transactions[i]);
        }
    }
}
