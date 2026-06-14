import java.util.Scanner;

class Question2 {

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

    static boolean check(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] a = words(s);
        String[] b = s.split(" ");

        System.out.println(check(a, b));
    }
}