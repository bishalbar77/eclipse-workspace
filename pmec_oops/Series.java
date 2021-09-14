package pmec_oops;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp1=0, temp2=0,temp3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the series number :");
		double n = sc.nextDouble();
		for(double i=1;i<=n;i++)
		{
			temp1 = temp1+i;
			temp2= temp2+Math.pow(i, 2.0);
			temp3= temp3+Math.pow(i, 3.0);
		}
		System.out.println("Result of 1th series : "+temp1);
		System.out.println("Result of 2nd series : "+temp2);
		System.out.println("Result of 3rd series : "+temp3);

	}

}
