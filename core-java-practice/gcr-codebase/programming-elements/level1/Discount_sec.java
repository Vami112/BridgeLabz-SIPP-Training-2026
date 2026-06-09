import java.util.*;

public class  Discount_sec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int fee= sc.nextInt();
		int dis= sc.nextInt();
		int per=(fee*dis)/100;
		int sub= fee- per;
		System.out.println(sub);
		
		}}