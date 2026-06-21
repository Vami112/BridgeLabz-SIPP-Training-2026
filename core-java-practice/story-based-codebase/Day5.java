public class Day5 {

    int instanceVar = 100;

    boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    int fibonacci(int n) {

        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    long power(int base, int exp) {

        long result = 1;

        while (exp > 0) {
            result *= base;
            exp--;
        }

        return result;
    }

    public static void main(String[] args) {

        Day5 obj = new Day5();

        int localVar = 50;

        System.out.println(obj.isPrime(13));
        System.out.println(obj.factorial(5));
        System.out.println(obj.factorial(5.0));
        System.out.println(obj.fibonacci(7));
        System.out.println(obj.gcd(12, 18));
        System.out.println(obj.lcm(12, 18));
        System.out.println(obj.power(2, 5));

        System.out.println(localVar);
        System.out.println(obj.instanceVar);
    }
}