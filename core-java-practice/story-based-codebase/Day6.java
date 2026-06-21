public class Day6 {

    static int moves = 0;

    static void towerOfHanoi(int n, char source, char helper, char destination) {

        if (n == 1) {
            System.out.println(source + " -> " + destination);
            moves++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println(source + " -> " + destination);
        moves++;

        towerOfHanoi(n - 1, helper, source, destination);
    }

    static int binarySearch(int[] arr, int low, int high, int target) {

        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target) return mid;

        if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);

        return binarySearch(arr, mid + 1, high, target);
    }

    static int sumDigits(int n) {

        if (n == 0) return 0;

        return n % 10 + sumDigits(n / 10);
    }

    static String reverse(String str) {

        if (str.isEmpty()) return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

    static boolean balanced(String str, int count, int index) {

        if (count < 0) return false;

        if (index == str.length()) return count == 0;

        if (str.charAt(index) == '(')
            return balanced(str, count + 1, index + 1);

        if (str.charAt(index) == ')')
            return balanced(str, count - 1, index + 1);

        return balanced(str, count, index + 1);
    }

    public static void main(String[] args) {

        towerOfHanoi(3, 'A', 'B', 'C');

        System.out.println("Moves = " + moves);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(binarySearch(arr, 0, arr.length - 1, 30));
        System.out.println(sumDigits(1234));
        System.out.println(reverse("hello"));
        System.out.println(balanced("(())()", 0, 0));
    }
}