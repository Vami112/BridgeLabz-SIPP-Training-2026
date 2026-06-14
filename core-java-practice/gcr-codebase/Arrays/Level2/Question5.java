import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] arr = new int[count];

        temp = n;

        for (int i = count - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }

        int[] rev = new int[count];

        for (int i = 0; i < count; i++) {
            rev[i] = arr[count - 1 - i];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(rev[i]);
        }
    }
}