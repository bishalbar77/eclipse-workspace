package pmec_oops;

import java.util.Scanner;
public class AreaOfSqRect {



	AreaOfSqRect(double length, double breadth) {
				System.out.println("Area of Rectangle = "+(length*breadth));
		}
	AreaOfSqRect(double side) {
				System.out.println("Area of Square = "+(side*side));
				
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter case number (1-Rectangle 2-Square): ");
			int n = sc.nextInt();
			if(n<2)
			{
				System.out.println("Enter 1st parameter :");
				double para1 = sc.nextDouble();
				System.out.println("Enter 2nd parameter :");
				double para2 = sc.nextDouble();
				AreaOfSqRect Area2P = new AreaOfSqRect(para1, para2);
			}
			else
			{
				System.out.println("Enter 1st parameter :");
				double para2 = sc.nextDouble();
				AreaOfSqRect Area2P = new AreaOfSqRect(para2);
			}
		}

	
}
