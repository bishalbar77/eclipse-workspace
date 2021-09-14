package pmec_oops;

import java.util.Scanner;

public class StaticMenu {
	static int num1;
	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("Static block initialised");
		System.out.print("Enter case number : ");
		int c = sc.nextInt();
		Switch(c);
		System.exit(0);
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		num1=10;
		System.out.println("Static variable initialised "+num1);
	}
	
	private static void Switch(int c) {
		// TODO Auto-generated method stub
		switch(c) {
		  case 1:
			  main(null);
		    break;
		  case 2:
			 display();
			break;
		  default:
		System.out.print("Invalid case number");
		}
	}

	static void display() {
		System.out.println("Static method initialised");
	}

}
