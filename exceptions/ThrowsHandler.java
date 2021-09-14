package exceptions;

import java.util.Scanner;

public class ThrowsHandler {
	public int division(int a, int b)
	{
	      int c = a/b;
	      return c;
	   }
	   public static void main(String args[])
	   {
		   ThrowsHandler ob = new ThrowsHandler();
	      try
	      {
	    	  Scanner sc = new Scanner(System.in);
	    	  System.out.print("Enter numerator : ");
	    	  int a = sc.nextInt();
	    	  System.out.print("Enter denominator : ");
	    	  int b = sc.nextInt();
	    	  System.out.println(ob.division(a,b));
	      }
	      catch(ArithmeticException e)
	      {
	         System.out.println("Denominator should not be zero");
	      }
	   }
}
