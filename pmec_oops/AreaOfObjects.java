package pmec_oops;

import java.util.Scanner;

public class AreaOfObjects {

	AreaOfObjects(double length, double breadth, int n) {
		switch(n) {
		case 1:
			System.out.println("Area of traingle = "+0.5*(length*breadth));
			break;
		case 2:
			System.out.println("Area of rectangle = "+(length*breadth));     // length X breadth
			break;
		case 3:
			System.out.println("Area of cylinder = "+2*3.14*(length*breadth)); //2nrh
			break;
		}
	}
	AreaOfObjects(double radius, int n) {
		switch(n) {
		case 4:
			System.out.println("Area of circle = "+3.14*(radius*radius));
			break;
		case 5:
			System.out.println("Area of sphere = "+4*3.14*(radius*radius));
			break;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter case number : ");
		int n = sc.nextInt();
		if(n>0 && n<4)
		{
			System.out.println("Enter 1st parameter :");
			double para1 = sc.nextDouble();
			System.out.println("Enter 2nd parameter :");
			double para2 = sc.nextDouble();
			AreaOfObjects Area2P = new AreaOfObjects(para1, para2, n);
		}
		else if(n==4 || n==5)
		{
			System.out.println("Enter 1st parameter :");
			double para1 = sc.nextDouble();
			System.out.println("Enter 2nd parameter :");
			double para2 = sc.nextDouble();
			AreaOfObjects Area2P = new AreaOfObjects(para2, n);
		}
		else {
			System.out.println("Not an valid option.");
		}
	}

}
