import java.util.Scanner;

class Question2 {

    static int recSum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + recSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int a = recSum(n);
        int b = formulaSum(n);

        System.out.println("Recursive Sum = " + a);
        System.out.println("Formula Sum = " + b);

        if (a == b) {
            System.out.println("Both Results are Same");
        }
    }
}