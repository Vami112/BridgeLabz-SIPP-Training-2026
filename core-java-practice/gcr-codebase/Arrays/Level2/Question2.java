import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] h = new double[3];

        String[] name = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            h[i] = sc.nextDouble();
        }

        int y = 0;
        int t = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[y]) {
                y = i;
            }

            if (h[i] > h[t]) {
                t = i;
            }
        }

        System.out.println("Youngest = " + name[y]);
        System.out.println("Tallest = " + name[t]);
    }
}