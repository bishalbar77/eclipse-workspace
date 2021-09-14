package random;

import java.util.Scanner;

public class Multiply {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int num2 = sc.nextInt();
		multiply(num1, num2);

	}

	private static void multiply(int num1, int num2) 
	{
			System.out.println("a^b of "+num1+" and "+num2+" is "+(num1^num2));
		
	}
}
