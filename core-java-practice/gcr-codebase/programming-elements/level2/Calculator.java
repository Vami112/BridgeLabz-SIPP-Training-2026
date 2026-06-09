import java.util.Scanner;

public class Calculator{

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	 int n1= sc.nextInt();
	 int n2= sc.nextInt();
	 char op= sc.next().charAt(0);
	 switch(op){
	  case'+': System.out.println(n1+n2); break;
	   case'-': System.out.println(n1-n2); break;
	    case'*': System.out.println(n1*n2); break;
		 case'/': System.out.println(n1/n2); break;
		  case'%': System.out.println(n1%n2); break;
		  default:
		   System.out.println("invalid");
	  
	  
	 

	 } }}