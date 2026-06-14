import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[10];
        int index = 0;

        while (n != 0) {
            arr[index] = n % 10;
            n = n / 10;
            index++;

            if (index == 10) {
                break;
            }
        }

        int largest = 0;
        int second = 0;

        for (int i = 0; i < index; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}