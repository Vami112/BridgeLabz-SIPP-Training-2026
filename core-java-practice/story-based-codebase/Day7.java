class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Day7 {

    public static void main(String[] args) {

        try {
            int bill = 1000;
            int items = 0;

            System.out.println(bill / items);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed.");
        }

        try {
            int[] patients = {1, 2, 3};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index.");
        }

        try {
            Integer.parseInt("ABC");

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }

        try {

            double balance = 500;
            double payment = 1000;

            if (payment > balance) {
                throw new InsufficientFundsException("Payment failed.");
            }

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}