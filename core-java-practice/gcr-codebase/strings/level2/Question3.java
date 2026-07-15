import java.util.Scanner;

class Question3 {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] arr = words(s);
        String[][] ans = data(arr);

        System.out.println("Word\tLength");

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + "\t" + Integer.parseInt(ans[i][1]));
        }
    }
}