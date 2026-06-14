import java.util.Scanner;

class Question4 {

    static String[][] freq(String s) {

        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        String[][] ans = new String[count][2];

        int k = 0;

        for (int i = 0; i < 256; i++) {
            if (arr[i] > 0) {
                ans[k][0] = String.valueOf((char) i);
                ans[k][1] = String.valueOf(arr[i]);
                k++;
            }
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