import java.util.Scanner;

class Question2 {

    static String sub(String s, int start, int end) {
        String ans = "";

        for (int i = start; i < end; i++) {
            ans += s.charAt(i);
        }

        return ans;
    }

    static boolean check(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String a = sub(s, start, end);
        String b = s.substring(start, end);

        System.out.println(a);
        System.out.println(b);
        System.out.println(check(a, b));
    }
}