import java.util.Scanner;

class Question3 {

    static double rounds(double a, double b, double c) {
        double p = a + b + c;
        return 5000 / p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Rounds Required = " + rounds(a, b, c));
    }
}