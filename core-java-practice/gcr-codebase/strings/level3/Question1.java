import java.util.Scanner;

class Question1 {

    static String[] bmi(double w, double h) {
        String[] arr = new String[2];

        double m = h / 100.0;
        double b = w / (m * m);

        arr[0] = String.format("%.2f", b);

        if (b < 18.5) {
            arr[1] = "Underweight";
        } else if (b < 25) {
            arr[1] = "Normal";
        } else if (b < 40) {
            arr[1] = "Overweight";
        } else {
            arr[1] = "Obese";
        }

        return arr;
    }

    static String[][] data(double[][] arr) {
        String[][] ans = new String[10][4];

        for (int i = 0; i < 10; i++) {
            String[] temp = bmi(arr[i][0], arr[i][1]);

            ans[i][0] = String.valueOf(arr[i][1]);
            ans[i][1] = String.valueOf(arr[i][0]);
            ans[i][2] = temp[0];
            ans[i][3] = temp[1];
        }

        return ans;
    }

    static void display(String[][] arr) {
        System.out.println("Height\tWeight\tBMI\tStatus");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1] + "\t" + arr[i][2] + "\t" + arr[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] arr = new double[10][2];

        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
        }

        String[][] ans = data(arr);

        display(ans);
    }
}