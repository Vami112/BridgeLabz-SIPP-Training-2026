import java.util.HashSet;

public class Day3 {

    public static void main(String[] args) {

        int[] stock = {10, 20, 30, 20, 50};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : stock) {

            max = Math.max(max, num);
            min = Math.min(min, num);
            total += num;

            if (!set.add(num)) {
                System.out.println("Duplicate: " + num);
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Total Stock = " + total);

        int k = 2;
        int n = stock.length;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        for (int num : rotated) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int j = 0; j < shelf[0].length; j++) {
            for (int i = 0; i < shelf.length; i++) {
                System.out.print(shelf[i][j] + " ");
            }
            System.out.println();
        }
    }
}