import java.util.Scanner;

public class Question3 {

    static int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    static int[] storeDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        return digits;
    }

    static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    static int sumOfSquares(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }

        return sum;
    }

    static boolean isHarshad(int num, int[] digits) {
        return num % sumOfDigits(digits) == 0;
    }

    static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        System.out.println("Sum of Digits = " + sumOfDigits(digits));
        System.out.println("Sum of Squares = " + sumOfSquares(digits));
        System.out.println("Harshad Number = " + isHarshad(num, digits));

        int[][] freq = digitFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
            }
        }
    }
}