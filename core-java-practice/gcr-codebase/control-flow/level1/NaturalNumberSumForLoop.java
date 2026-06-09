import java.util.Scanner;

public class NaturalNumberSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number is not a natural number.");
        } else {

            int formulaSum = n * (n + 1) / 2;

            int forSum = 0;

            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + forSum);

            if (formulaSum == forSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Results do not match.");
            }
        }

        sc.close();
    }
}