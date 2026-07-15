class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void getStatement() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class Question1 {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("A101", "Ravi", 10000);
        BankAccount a2 = new BankAccount("A102", "Priya", 15000);
        BankAccount a3 = new BankAccount("A103", "Aman", 20000);

        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);
        a1.getStatement();

        a2.deposit(3000);
        a2.withdraw(1000);
        a2.deposit(2000);
        a2.withdraw(5000);
        a2.deposit(1000);
        a2.getStatement();

        a3.deposit(5000);
        a3.withdraw(2000);
        a3.deposit(1000);
        a3.withdraw(3000);
        a3.deposit(4000);
        a3.getStatement();

        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}