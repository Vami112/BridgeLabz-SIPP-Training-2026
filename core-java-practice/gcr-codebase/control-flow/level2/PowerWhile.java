import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers");
        } else {
            long result = 1;
            int counter = 0;

            while (counter < power) {
                result = result * number;
                counter++;
            }

            System.out.println("Result = " + result);
        }

        sc.close();
    }
}