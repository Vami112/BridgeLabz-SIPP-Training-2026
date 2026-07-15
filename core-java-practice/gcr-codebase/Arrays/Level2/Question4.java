import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        int maxDigit = 10;
        int[] arr = new int[maxDigit];
        int index = 0;

        while (n != 0) {
            if (index == maxDigit) {
                maxDigit += 10;

                int[] temp = new int[maxDigit];

                for (int i = 0; i < arr.length; i++) {
                    temp[i] = arr[i];
                }

                arr = temp;
            }

            arr[index] = (int)(n % 10);
            n = n / 10;
            index++;
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