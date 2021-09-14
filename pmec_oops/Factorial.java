package pmec_oops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("\nFactorial of "+num+" is "+factorial(num));

	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		return fact;
		
	}

}
