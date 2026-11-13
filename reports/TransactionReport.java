package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account a) {

        System.out.println("\n--- TRANSACTION REPORT ---");

        System.out.println("Account Number: "
                + a.getAccountNumber());

        System.out.println("\nTransaction History:");

        a.displayTransactions();

        System.out.println("\nFinal Balance: Rs. "
                + a.getBalance());

        System.out.println("--------------------------");
    }
}




