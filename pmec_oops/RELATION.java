package pmec_oops;

import java.util.Scanner;

public class RELATION {

	   public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter two numbers");
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      System.out.println("a == b = " + (a == b) );
	      System.out.println("a != b = " + (a != b) );
	      System.out.println("a > b = " + (a > b) );
	      System.out.println("a < b = " + (a < b) );
	      System.out.println("b >= a = " + (b >= a) );
	      System.out.println("b <= a = " + (b <= a) );
	   }
}
