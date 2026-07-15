import java.util.Scanner;

class Scenerio2 {

    static boolean check(String s, int i) {
        if (i == s.length()) {
            return true;
        }

        char ch = s.charAt(i);

        if (ch < 'a' || ch > 'z') {
            return false;
        }

        return check(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(check(s, 0));
    }
}