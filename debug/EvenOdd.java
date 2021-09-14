package debug;

import java.util.Scanner;

public class EvenOdd {

	public static void printPattern( int num) {
		int i, print =0;
		if(num%2==0) {
			for(i=0;i<num;i++) 
			{
				System.out.println(print+" ");
				print +=2;
			}
		}
		else {
			print = 1;
			for(i=0;i<num;i++)
			{
				System.out.println(print+ " ");
				print +=2;
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printPattern( num);
	}
}
