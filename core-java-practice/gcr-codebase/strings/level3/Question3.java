import java.util.Scanner;

class Question3 {

    static char first(String s) {
        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("First Non-Repeating Character = " + first(s));
    }
}