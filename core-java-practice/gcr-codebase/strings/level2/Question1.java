import java.util.Scanner;

class Question1 {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println("Length = " + len(s));
        System.out.println("Built In Length = " + s.length());
    }
}