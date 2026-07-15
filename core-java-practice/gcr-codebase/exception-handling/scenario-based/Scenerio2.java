import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    private double balance;
    private double amount;

    InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance");
        this.balance = balance;
        this.amount = amount;
    }

    public String getMessage() {
        return "Balance = ₹" + balance +
               ", Withdrawal = ₹" + amount +
               ", Insufficient Balance";
    }
}

class Scenerio2 {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {

            double balance = 5000;
            double amount = 8000;

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}