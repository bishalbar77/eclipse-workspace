package pmec_oops;

import java.util.Scanner;

abstract class Parent{  
	  abstract void getPercentage(int subjects, int mark[]);  
	}  
	class B extends Parent{  
	void getPercentage(int subjects, int mark[]) {
		int percent =0;
		for( int i : mark)
			percent += i;
		System.out.println("Percentage of student is "+(percent/subjects)+"%");
	}
	public static void main(String args[])
	{  
	Parent obj = new B();  
	Scanner sc = new Scanner(System.in);
	int mark[] = new int[4];
	System.out.println("Enter student marks");
	for(int i=0;i<4;i++) {
		mark[i] = sc.nextInt();
	}
	obj.getPercentage(4, mark);  
	}
}  
