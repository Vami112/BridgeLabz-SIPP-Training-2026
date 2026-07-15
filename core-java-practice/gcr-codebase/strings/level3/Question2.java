import java.util.Scanner;

class Question2 {

    static int len(String s) {
        int c = 0;

        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
        }

        return c;
    }

    static char[] unique(String s) {
        char[] temp = new char[len(s)];
        int k = 0;

        for (int i = 0; i < len(s); i++) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr = unique(s);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}