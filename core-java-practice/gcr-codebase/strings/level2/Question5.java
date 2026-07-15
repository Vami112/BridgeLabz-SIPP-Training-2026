import java.util.Scanner;

class Question5 {

    static String check(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }

            return "Consonant";
        }

        return "Not a Letter";
    }

    static int[] count(String s) {
        int v = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            String ans = check(s.charAt(i));

            if (ans.equals("Vowel")) {
                v++;
            } else if (ans.equals("Consonant")) {
                c++;
            }
        }

        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] arr = count(s);

        System.out.println("Vowels = " + arr[0]);
        System.out.println("Consonants = " + arr[1]);
    }
}