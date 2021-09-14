package pmec_oops;

import java.util.Scanner;

public class A extends Marks {
	A(int subject1, int subject2,int subject3) {
		getPercentage();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		A obj = new A(subject1,subject2, subject3);
	}

	@Override
	void getPercentage() {
		Scanner sc = new Scanner(System.in);
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		A obj = new A(subject1,subject2, subject3);
		System.out.println("hi");
	}

}
