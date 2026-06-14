import java.util.Scanner;

class Question4 {

    static int len(String s) {
        int count = 0;

        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    static String[] words(String s) {
        int count = 1;

        for (int i = 0; i < len(s); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        String[] arr = new String[count];

        String w = "";
        int k = 0;

        for (int i = 0; i < len(s); i++) {
            if (s.charAt(i) != ' ') {
                w += s.charAt(i);
            } else {
                arr[k++] = w;
                w = "";
            }
        }

        arr[k] = w;

        return arr;
    }

    static String[][] data(String[] arr) {
        String[][] ans = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            ans[i][0] = arr[i];
            ans[i][1] = String.valueOf(len(arr[i]));
        }

        return ans;
    }

    static int[] find(String[][] arr) {
        int min = 0;
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i][1]);
            int b = Integer.parseInt(arr[min][1]);
            int c = Integer.parseInt(arr[max][1]);

            if (a < b) {
                min = i;
            }

            if (a > c) {
                max = i;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[][] arr = data(words(s));

        int[] ans = find(arr);

        System.out.println("Shortest = " + arr[ans[0]][0]);
        System.out.println("Longest = " + arr[ans[1]][0]);
    }
}