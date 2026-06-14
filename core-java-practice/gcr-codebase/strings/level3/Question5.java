import java.util.Scanner;

class Question5 {

    static char[] unique(String s) {

        char[] temp = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k++] = s.charAt(i);
            }
        }

        char[] ans = new char[k];

        for (int i = 0; i < k; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }

    static String[][] freq(String s) {

        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        char[] u = unique(s);

        String[][] ans = new String[u.length][2];

        for (int i = 0; i < u.length; i++) {
            ans[i][0] = String.valueOf(u[i]);
            ans[i][1] = String.valueOf(arr[u[i]]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[][] ans = freq(s);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + "\t\t" + ans[i][1]);
        }
    }
}