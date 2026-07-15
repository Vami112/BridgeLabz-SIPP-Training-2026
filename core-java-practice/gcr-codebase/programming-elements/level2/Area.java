import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int h = sc.nextInt();

        double area = 0.5 * base * h;

        System.out.println(area);
    }
}