import java.util.Scanner;

public class Question4 {

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

    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        return rev;
    }

    static boolean compareArrays(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    static boolean isPalindrome(int[] digits) {
        int[] reverse = reverseArray(digits);
        return compareArrays(digits, reverse);
    }

    static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        System.out.println("Palindrome Number = " + isPalindrome(digits));
        System.out.println("Duck Number = " + isDuckNumber(digits));
    }
}