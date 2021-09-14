package exceptions;

import java.util.Scanner;

public class NewException {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		try
		{
			for(int i=0;sc.hasNext();i++)
			{
				array[i] = sc.nextInt();
			}
			input();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index Out of bounds");
		}
	    catch(Exception e) 
		{
	         System.out.println("Some other exceptions");
	    }
	}
	
	public static void input()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int b=10, c=0;
			int a= sc.nextInt();
			c=b/a;
		}
		catch(ArithmeticException e)
		{
			
		}
	}
}
