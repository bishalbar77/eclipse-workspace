package pmec_oops;
import java.util.Scanner;
public class GreatestSmallest {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter three numbers:-");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c) {
			
			if(b>c) {
				System.out.println("greatest number is a = "+a+" and the smallest number is c = "+c);
			}
			else
			{
				System.out.println("greatest number is a = "+a+" and the smallest number is b = "+b);
			}
		}
		else if(b>c) {
			
			if(a>c) {
				System.out.println("greatest number is b = "+b+" and the smallest number is c = "+c);
			}
			else {
				System.out.println("greatest number is b = "+b+" and the smallest number is a = "+a);
			}
			
		}
		else {
			
			if(a>b) {
				System.out.println("greatest number is c = "+c+" and the smallest number is b = "+b);
			}
			else {
				System.out.println("greatest number is c = "+c+" and the smallest number is a = "+a);
			}
			
		}

	}
}
