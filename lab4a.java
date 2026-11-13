import transaction.Account;
import reports.TransactionReport;

public class lab4a {

    public static void main(String[] args) {

        Account a = new Account(1001, 5000);

        a.deposit(2000);
        a.withdraw(1000);
        a.deposit(3000);
        a.withdraw(500);

        TransactionReport report = new TransactionReport();

        report.generateReport(a);
    }
}

