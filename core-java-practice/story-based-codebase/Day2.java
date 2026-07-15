import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] incomes = {5000, 12000, 25000, 8000, 60000, 45000, 9000, 70000, 30000, 15000};
        double totalTax = 0;

        for (double income : incomes) {

            double tax;

            if (income < 10000) {
                tax = income * 0.05;
            } else if (income <= 50000) {
                tax = income * 0.15;
            } else {
                tax = income * 0.30;
            }

            totalTax += tax;
        }

        System.out.println("Total Tax Collected = " + totalTax);
    }
}