package pmec_oops;

import java.util.Scanner;

public class SwitchIntro {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the case number");
		int s=0;
		s = sc.nextInt();
		System.out.println("Enter the four numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		switch(s)
		{
			case 1:
				// (a+ib)+(c+id)
				System.out.println("Addition of two complex number = "+(a+c)+"+i"+(b+d));
				break;
				
			case 2:
				System.out.println("Subtraction of two complex number = "+(a-c)+"+i"+(b-d));
				break;
				
			case 3:
				System.out.println("Multiplication of two complex number = "+((a*c)+(b*d))+"+i"+((a*d)+(b*d)));
				break;
				
			case 4:
				System.out.println("Division of two complex number = "+(((a*c)+(b*d))/((c*c)+(d*d)))+"+i"+(((b*c)-(a*d))/((c*c)+(d*d))));
				break;
			default:
				System.out.println("Sorry no possible calculation found!");
		}
			
				
	}
}
