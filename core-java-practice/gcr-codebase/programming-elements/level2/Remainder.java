import java.util.Scanner;

public class  Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int  n1 = sc.nextInt();
		int n2 =sc.nextInt();
		int q=  n1/n2;
		int r = n1%n2;
		System.out.println(q);
		System.out.println(r);
		}}