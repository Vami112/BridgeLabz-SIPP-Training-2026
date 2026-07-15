import java.util.Scanner;

class InsufficientFundsException extends Exception {

    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class Scenerio1 {

    static void payment(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Payment Failed: Insufficient Funds");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Division = " + (a / b));

            int[] arr = {101, 102, 103, 104, 105};

            int index = sc.nextInt();
            System.out.println("Patient ID = " + arr[index]);

            String s = sc.next();
            int num = Integer.parseInt(s);

            double balance = sc.nextDouble();
            double amount = sc.nextDouble();

            payment(balance, amount);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}