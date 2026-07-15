import java.util.*;

public class  Divide_pen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		    int pen=sc.nextInt();
			int stu=sc.nextInt();
			int s1= pen%stu;
			int s2= pen/stu;
			System.out.println("The Pen Per Student is"+s2+"and the remaining pen not distributed is"+s1);

			
		 }}