package exceptions;

import java.util.Scanner;

public class ThrowHandler {
	public int division(int a, int b)
	{
		if(b==0)
			throw new ArithmeticException("Denominator should not be zero");
		int c = a/b;
		return c;
    }
   public static void main(String args[])
   {
	   ThrowHandler ob = new ThrowHandler();
	   Scanner sc = new Scanner(System.in);
       System.out.print("Enter numerator : ");
       int a = sc.nextInt();
       System.out.print("Enter denominator : ");
       int b = sc.nextInt();
       System.out.println(ob.division(a,b));
   }
}
