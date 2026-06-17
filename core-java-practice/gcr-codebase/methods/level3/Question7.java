import java.util.Scanner;

public class Question7 {

    static int[] getFactors(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    static int sumFactors(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    static long productFactors(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    static double productOfCubes(int[] factors) {

        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nGreatest Factor = " + greatestFactor(factors));
        System.out.println("Sum of Factors = " + sumFactors(factors));
        System.out.println("Product of Factors = " + productFactors(factors));
        System.out.println("Product of Cubes = " + productOfCubes(factors));
    }
}